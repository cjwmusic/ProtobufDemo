package com.kongge;

public class Main {

    public static void main(String[] args) {

        /**
         * protobuf 序列化
         */
        Person.PBUser.Builder builder =  Person.PBUser.newBuilder();
        builder.setUserId("1002");
        builder.setAvatar("1003");
        builder.setNick("cjw");

        Person.PBUser user =  builder.build();
        byte[] userBytes = user.toByteArray();

//        int maxBytes = userBytes.length;


//        Person.PBUser.parseFrom()

        System.out.println("服务器启动...");
        SocketServer server = new SocketServer();
        server.init();

    }


}
