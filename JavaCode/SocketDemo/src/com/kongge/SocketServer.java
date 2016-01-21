package com.kongge;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by wukong on 16/1/18.
 */
public class SocketServer {

    public static final int PORT = 12345;

    public void init() {

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            //主线程负责监听客户端的连接
            while (true) {

                Socket client = serverSocket.accept();
                System.out.println("收到连接请求");
                //接收数据线程
                new ReadHandlerThread(client);
                //发送数据线程
                new SendHandlerThread(client);

            }
        } catch (Exception e) {
            System.out.println("服务器启动异常：" + e.getMessage());
        }
    }

    private class ReadHandlerThread implements Runnable {

        private Socket socket = null;
        private boolean readHeader_f = true;
        private int maxBytes = 0;

        //接收到的数据的缓存
        byte tempStringBytes[] = new byte[1024];

        public ReadHandlerThread(Socket client) {
            socket = client;
            new Thread(this).start();
        }

        @Override
        public void run() {

            try {

                DataInputStream input = new DataInputStream(socket.getInputStream());
                while (true) {

                    int length = 0;
                    if (readHeader_f) {

                        length = input.read(tempStringBytes,0,4);
                        //计算出maxByte;
                        maxBytes = Utils.bytes2Int(tempStringBytes);
                        readHeader_f = false;

                    } else {

                        if (maxBytes > 0) {

                            length = input.read(tempStringBytes,0,maxBytes);

                            //解析
                            System.out.println("读到了数据");
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
                            String timeStr = dateFormat.format(new Date());
                            System.out.println("----------------------时间:" + timeStr + "----------------------");

                            /**
                             * 对收到的数据进行反序列化
                             */
                            byte aa[] = new byte[length];
                            System.arraycopy(tempStringBytes, 0, aa, 0, length);

                            Person.PBUser user = Person.PBUser.parseFrom(aa);
                            System.out.println("user.userId is " + user.getUserId() + "\n" + "user.nick is " + user.getNick()
                                    + "\n" + "user.avatar is " + user.getAvatar());

                            readHeader_f = true;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 发送数据的线程
     */
    private class SendHandlerThread implements Runnable {

        private Socket socket;

        public SendHandlerThread(Socket client) {

            socket = client;
            new Thread(this).start();

        }

        @Override
        public void run() {

            try {

                OutputStream out = socket.getOutputStream();

                while (true) {

                    //请输入数据
                    System.out.println("回车键发送数据");
                    String s = new BufferedReader(new InputStreamReader(System.in)).readLine();

                    /*
                     * 序列化数据，回复给客户端
                     */
                    Person.PBUser.Builder builder = Person.PBUser.newBuilder();
                    builder.setUserId("1002");
                    builder.setAvatar("1003");
                    builder.setNick("wukong");
                    Person.PBUser replyUser = builder.build();

                    //消息体
                    byte[] replyUserBytes = replyUser.toByteArray();

                    //消息头
                    int maxBytes = replyUserBytes.length;
                    byte[] headerBytes = Utils.int2Bytes(maxBytes,4);

                    //组合体
                    headerBytes = Arrays.copyOf(headerBytes,4 + maxBytes);
                    System.arraycopy(replyUserBytes,0,headerBytes,4,maxBytes);

                    out.write(headerBytes);
                    System.out.println("数据已发送");

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
