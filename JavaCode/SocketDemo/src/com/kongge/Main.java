package com.kongge;

public class Main {

    public static void main(String[] args) {

        SocketServer server = new SocketServer();
        server.init();
        System.out.println("服务器已经启动...");

    }

}
