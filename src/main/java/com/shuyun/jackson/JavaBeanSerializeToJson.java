package com.shuyun.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuyun on 2016/8/11.
 * JavaBeanSerializeToJson
 */
public class JavaBeanSerializeToJson {
    public static void convert() throws ParseException, IOException {
     //使用ObjectMapper转化Json
        ObjectMapper mapper=new ObjectMapper();

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        mapper.setDateFormat(dateFormat);

        Country country=new Country("China");
        country.setBirthDate(dateFormat.parse("1949-10-01"));
        country.setLakes(new String[] { "Qinghai Lake", "Poyang Lake",
                "Dongting Lake", "Taihu Lake" });

        List<String> nation = new ArrayList<String>();
        nation.add("Han");
        nation.add("Meng");
        nation.add("Hui");
        nation.add("WeiWuEr");
        nation.add("Zang");
        country.setNation(nation);

        Province province = new Province();
        province.name = "Shanxi";
        province.population = 37751200;
        Province province2 = new Province();
        province2.name = "ZheJiang";
        province2.population = 55080000;
        List<Province> provinces = new ArrayList<Province>();
        provinces.add(province);
        provinces.add(province2);
        country.setProvinces(provinces);

        country.addTraffic("Train(KM)", 112000);
        country.addTraffic("HighWay(KM)", 4240000);
        //下面这一行代码增加可读性
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        //配置mapper忽略空属性
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.writeValue(new File("d:/Test/counry.json"),country);

    }
    public static void main(String[] args) throws IOException, ParseException {
          convert();
    }
}
