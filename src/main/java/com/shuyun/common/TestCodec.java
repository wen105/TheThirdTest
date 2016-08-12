package com.shuyun.common;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by shuyun on 2016/8/12.
 * TestCodec
 */
public class TestCodec {
    private static void testBase64(){
        Base64 base64=new Base64();
        byte[] bytes="wenjia1314".getBytes();
        String encode=base64.encodeAsString(bytes);
        System.out.println(encode);
        System.out.println(new String(base64.decode(encode)));
    }
    private static void testMd5(){
        String data="wenjia1314";
        String md5= DigestUtils.md5Hex(data);
        System.out.println(md5);
    }
    public static void main(String[] args) {
        //testBase64();
        testMd5();
    }
}
