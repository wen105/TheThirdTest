package com.shuyun.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Created by shuyun on 2016/8/11.
 */
@JsonTypeName(value="elephant")
public class Elephant extends Animal {
    private String name;
    @JsonCreator
    public Elephant(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return "herbivorous";
    }

    @Override
    public String toString() {
        return "Elephant [getName()=" + getName() + ", getType()=" + getType()
                + "]";
    }

}
