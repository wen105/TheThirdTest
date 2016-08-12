package com.shuyun.guava;


import com.google.common.collect.*;
import com.google.common.primitives.Ints;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * Created by shuyun on 2016/8/11.
 * TestGuava
 */
public class TestGuava {
    public static void main(String[] args) {
       List<String> testStr=Lists.newArrayList("wen","jia","1212","xin","jia");
        System.out.println(testStr);
        List<Integer> integerList=Lists.newArrayListWithCapacity(100);
        System.out.println(integerList.size());
        Map<Integer,String> mapTest=Maps.newLinkedHashMap();

        mapTest.put(1,"wenjia");
        mapTest.put(2,"1314");
        mapTest.put(3,"mary");
        System.out.println(mapTest);
        Iterable<Integer> concatenated= Iterables.concat(Ints.asList(1,2,3),Ints.asList(4,5,6));
        for (Object aConcatenated : concatenated) {
            System.out.print(aConcatenated);
        }
        System.out.println("\nIterables.getLast");
        System.out.println(Iterables.getLast(concatenated));
        List countUp = Ints.asList(1, 2, 3, 4, 5);
        System.out.println(Lists.reverse(countUp));
        List<List> parts=Lists.partition(countUp,2);
        System.out.println(parts.size());

    }
}
