package com.shuyun.jackson;

import java.util.Arrays;

/**
 * Created by shuyun on 2016/8/11.
 */
public class Province {
    public String name;
    public int population;
    public String[] city;

    @Override
    public String toString() {
        return "Province{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", city=" + Arrays.toString(city) +
                '}';
    }
}
