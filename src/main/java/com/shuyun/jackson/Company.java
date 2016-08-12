package com.shuyun.jackson;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Created by shuyun on 2016/8/11.
 */
public class Company {
    private String name;
    @JsonProperty("HQ")     //java属性headquarters序列化到json时字段名称为HQ
    private String headquarters;
    private Department[] departments;
    @JsonIgnore    //序列化时忽略属性
    private Date birthDate;
   @JsonCreator
   public Company(@JsonProperty("name") String name){
       this.name=name;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
