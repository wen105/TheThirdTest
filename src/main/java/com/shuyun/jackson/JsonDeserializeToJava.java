package com.shuyun.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by shuyun on 2016/8/11.
 * 将json数据反序列化为java对象
 */
public class JsonDeserializeToJava {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        File json=new File("d:/Test/counry.json");
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Country country=mapper.readValue(json,Country.class);
        List<Province> provinces=country.getProvinces();
        for(Province p:provinces){
            System.out.println(p);
        }
    }
}
