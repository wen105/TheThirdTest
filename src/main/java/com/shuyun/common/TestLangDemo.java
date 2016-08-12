package com.shuyun.common;

import org.apache.commons.lang.*;
import org.omg.CORBA.OBJ_ADAPTER;

import java.io.*;
import java.util.Date;

/**
 * Created by shuyun on 2016/8/12.
 * TestLangDemo
 */
public class TestLangDemo {
    public static void charSetDemo(){
        CharSet charSet=CharSet.getInstance("a");
        String demoStr = "The quick brown fox jumps over the lazy dog.";
        int count=0;
        for (int i=0;i<demoStr.length();i++){
           if(charSet.contains(demoStr.charAt(i))){
               count++;
           }
        }
        System.out.println(count);
    }
    public static void charSetUtilsDemo(){
        System.out.println("计算字符串中包含某字符数.");
        System.out.println(CharSetUtils.count("The quick brown fox jumps over the lazy dog.", "aeiou"));

        System.out.println("删除字符串中某字符.");
        System.out.println(CharSetUtils.delete("The quick brown fox jumps over the lazy dog.", "aeiou"));

        System.out.println("保留字符串中某字符.");
        System.out.println(CharSetUtils.keep("The quick brown fox jumps over the lazy dog.", "aeiou"));

        System.out.println("合并重复的字符.");
        System.out.println(CharSetUtils.squeeze("a  bbbbbb     c dd", "b d"));
    }
    public static void objectUtilsDemo(){
        System.out.println("对象为空null时，默认打印字符");
        Object o=null;
        System.out.println(ObjectUtils.defaultIfNull(o,"isNull"));

        System.out.println("验证两个引用是否指向的Object相等");
        Object a=new Object();
        Object b=new Object();
        System.out.println(ObjectUtils.equals(a,b));

    }
    private static void serializationUtilsDemo(){
        System.out.println("*SerializationUtils**");
        Date date = new Date();
        byte[] bytes = SerializationUtils.serialize(date);
        System.out.println(ArrayUtils.toString(bytes));
        System.out.println(date);

        Date reDate = (Date) SerializationUtils.deserialize(bytes);
        System.out.println(reDate);
        System.out.println(ObjectUtils.equals(date, reDate));
        System.out.println(date == reDate);

        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fos = new FileOutputStream(new File("d:/Test/test.txt"));
            fis = new FileInputStream(new File("d:/Test/test.txt"));
            SerializationUtils.serialize(date, fos);
            Date reDate2 = (Date) SerializationUtils.deserialize(fis);

            System.out.println(date.equals(reDate2));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
       //charSetDemo();
        //charSetUtilsDemo();
        serializationUtilsDemo();
    }
}
