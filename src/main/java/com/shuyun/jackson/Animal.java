package com.shuyun.jackson;

/**
 * Created by shuyun on 2016/8/11.
 */

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use= JsonTypeInfo.Id.CLASS,include= JsonTypeInfo.As.PROPERTY,property="@class")
@JsonSubTypes({@JsonSubTypes.Type(value=Lion.class,name="lion"),@JsonSubTypes.Type(value=Elephant.class,name="elephant")})
public abstract  class Animal {
    String name;
    String type;
}
