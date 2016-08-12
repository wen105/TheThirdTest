package com.shuyun.common;

import com.shuyun.lombok.Student;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by shuyun on 2016/8/12.
 * TestTestng
 */
@Test
public class TestTestng {
    Student student=new Student();
    @BeforeTest
    private void before(){
        System.out.println("before test");
    }
    @AfterTest
    private void after(){
        System.out.println("after test");
    }
    @Test
    private void test1(){
        System.out.println("test1");
    }
    @Test
    private void test2(){
        student.setName("wenjai");
        student.setAge(20);
        System.out.println(student);
    }
    @Test
    @Parameters({"a","b"})
    private void test3(String a,String b){
        System.out.println(a);
        System.out.println("TestTestng.test3");
        System.out.println(b);
    }
}
