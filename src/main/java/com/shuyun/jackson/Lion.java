package com.shuyun.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Created by shuyun on 2016/8/11.
 */
@JsonTypeName(value="lion")
public class Lion extends Animal {
    private String name;
    @JsonCreator
    public Lion(@JsonProperty("name")String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String getType(){
        return "carnivorous";
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                "getName='" + getName() + '\'' +
                "getType='" + getType() + '\'' +
                '}';
    }
}
