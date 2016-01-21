package com.kongge;

import org.junit.Test;

/**
 * Created by wukong on 16/1/21.
 */
public class CommonTest {

    @Test
    public void test01() {

        byte[] bytes = Utils.int2Bytes(666,4);

        System.out.printf("bytes[0] is %X\n" , bytes[0]);
        System.out.printf("bytes[1] is %X\n" , bytes[1]);
        System.out.printf("bytes[2] is %X\n" , bytes[2]);
        System.out.printf("bytes[3] is %X\n" , bytes[3]);

        int result = Utils.bytes2Int(bytes);
        System.out.printf("result is %d", result);

    }

}
