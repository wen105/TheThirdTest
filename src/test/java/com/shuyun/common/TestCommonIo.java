package com.shuyun.common;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

/**
 * Created by shuyun on 2016/8/12.
 * TestCommonIo
 */

public class TestCommonIo {
  //  将URL的内容存入文件中去
    @Test
    public void test1() throws IOException {
        URL url=new URL("http://mvnrepository.com");
        File dest=new File("times.html");
        FileUtils.copyURLToFile(url,dest);
    }
    @Test
    public void test2(){
        try{
            File file=new File("d:/Test/data.txt");
            FileReader reader=new FileReader(file);
            String content=IOUtils.toString(reader);
            System.out.println(content);
            File dir=new File("D:\\Test\\TestProject\\FirstWeb\\src\\main\\java\\com\\shuyun\\dao");
            long dirSize=FileUtils.sizeOfDirectory(dir);
            System.out.println(dirSize);
            long fileSize=FileUtils.sizeOf(file);
            System.out.println(fileSize);
        }catch (IOException e){
            throw new RuntimeException(e.getMessage(),e);
        }
    }
}
