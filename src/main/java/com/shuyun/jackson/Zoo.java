package com.shuyun.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by shuyun on 2016/8/11.
 */
public class Zoo {
    public String name;
    public String city;
    public List<Animal> animals;

    @JsonCreator
    public Zoo(@JsonProperty("name") String name,@JsonProperty("city")  String city){
        this.name=name;
        this.city=city;
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", animals=" + animals +
                '}';
    }
}
