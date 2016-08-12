package com.shuyun.guava;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.*;
import com.google.common.primitives.Ints;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by shuyun on 2016/8/11.
 * User Sets and Maps
 */
public class TestSetAndMap {
    private static void useSets(){
        Set<String> word= ImmutableSet.of("one","two","three","four","fix");
        Set<String> primes=ImmutableSet.of("one","two","three","five");
        Sets.SetView<String> intersection= Sets.intersection(primes,word);
        System.out.println(intersection);
        System.out.println(intersection.immutableCopy());
        //返回集合的笛卡尔积
        Set<List<String>> products=Sets.cartesianProduct(word,primes);
        System.out.println(products);
        //返回指定集合的子集
        Set<String> animals = ImmutableSet.of("gerbil", "hamster");
        Set<Set<String>> wordSets=Sets.powerSet(animals);
        for (Set<String> s:wordSets){
            System.out.println(s);
        }
        System.out.println(wordSets.size());
    }
    private static void userMaps(){
        Map<String,Integer> left= ImmutableMap.of("a",1,"bb",2,"ccc",3);
        System.out.println(left);
        Set<String> set=ImmutableSet.of("sew","wewww","wejowjewe");
        ImmutableMap<Integer,String> strByInde=Maps.uniqueIndex(set, new Function<String, Integer>() {
            public Integer apply(String s) {
                return s.length();
            }
        });
        System.out.println(strByInde);
    }
    private static void useMutimaps(){
        ImmutableSet digits = ImmutableSet.of("zero", "one", "two", "three", "four","five", "six", "seven", "eight", "nine");
        ImmutableListMultimap digitsByLength=Multimaps.index(digits, new Function<String,Integer>() {
            public Integer apply(String str) {
                return str.length();
            }
        });
        System.out.println(digitsByLength);
    }
    public static void main(String[] args) {
        //useSets();
        //userMaps();
        useMutimaps();
    }
}
