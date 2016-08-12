package com.shuyun.lombok;

import com.google.common.collect.Lists;
import lombok.Cleanup;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.List;

/**
 * Created by shuyun on 2016/8/12.
 * LombokTest
 */
@Slf4j
public class LombokTest {
    private static void stream() throws Exception {
        @Cleanup
        InputStream in = new FileInputStream("d:/Test/data.txt");
        @Cleanup
        OutputStream out = new FileOutputStream("d:/Test/da.txt");
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1)
                break;
            out.write(b, 0, r);
        }
    }
   private static void testStu(){
       Student student = new Student();
       student.setId(1);
       student.setAge(20);
       student.setName("wenjia");
       student.setAddress("宝鸡");
       List<String> list = Lists.newArrayList("shxue", "wuli");
       student.setBooks(list);
       System.out.println(student);
   }
    private static void test1(@NonNull String target){
        String content=String.format("hello,%s",target);
        log.info(content);

    }

    public static void main(String[] args) throws Exception {
        // stream();
        //testStu();
        test1("world");
    }
}
