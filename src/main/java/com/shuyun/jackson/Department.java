package com.shuyun.jackson;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shuyun on 2016/8/11.
 * Department
 */
public class Department {
    private String name;
    private String pm;
    //otherProperties用来存放Department中未定义的json字段
    private Map<String, Object> otherProperties = new HashMap<String, Object>();
    @JsonCreator
    public Department(@JsonProperty("name" )String name){
        this.name=name;
    }
    @JsonProperty("projectManager")  //将company.json中projectManager字段关联到getPm方法
    public String getPm() {
        return pm;
    }

    public String getName() {
        return name;
    }

    public Object get(String key) {
        return otherProperties.get(key);
    }
  @JsonAnyGetter  //得到所有Department没有定义的字段
  public Map<String,Object> any(){
      return otherProperties;
  }
    @JsonAnySetter
    public void set(String key, Object value) {
        otherProperties.put(key, value);
    }
}
