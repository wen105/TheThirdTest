package com.shuyun.common;

import com.google.common.collect.Maps;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.IterableMap;
import org.apache.commons.collections.MapIterator;
import org.apache.commons.collections.bidimap.TreeBidiMap;
import org.junit.Test;

import java.util.HashMap;


/**
 * Created by shuyun on 2016/8/12.
 * TestConnection
 */
public class TestConnection {
    @Test
    public void test1(){
        HashMap<Integer,String> mapTest= Maps.newHashMap();
        mapTest.put(1,"wenjia");
        mapTest.put(2,"1314");
        mapTest.put(3,"mary");
        System.out.println(mapTest);
        //实现map的迭代
        HashMap<Integer,String> hashMap=new HashMap();
        hashMap.put(1,"wen");
        IterableMap iterableMap=(IterableMap)hashMap;
        MapIterator mapIterator=iterableMap.mapIterator();
        while (mapIterator.hasNext()){
            System.out.println(mapIterator.next());
            System.out.println(mapIterator.getValue());
        }
        }
    @Test
    public void test2(){
        BidiMap bidiMap=new TreeBidiMap();
        bidiMap.put(1,"five");
        bidiMap.put(2,"ten");
        System.out.println(bidiMap.getKey("ten"));
        System.out.println(bidiMap.get(1));
        BidiMap inverseMap=bidiMap.inverseBidiMap();
        System.out.println(inverseMap);
    }
}
