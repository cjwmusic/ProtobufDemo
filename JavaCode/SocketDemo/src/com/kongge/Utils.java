package com.kongge;

/**
 * Created by wukong on 16/1/21.
 */
public class Utils {

    public static byte[] int2Bytes(int value, int len) {
        byte[] b = new byte[len];
        for (int i = 0; i < len; i++) {
            b[i] = (byte)((value >> 8 * i) & 0xff);
        }
        return b;
    }

    public static int bytes2Int(byte[] bytes) {

        int value;
        value = (int) ((bytes[0] & 0xFF)
                | ((bytes[1] & 0xFF)<<8)
                | ((bytes[2] & 0xFF)<<16)
                | ((bytes[3] & 0xFF)<<24));
        return value;


    }
}
