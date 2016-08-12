package com.shuyun.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by shuyun on 2016/8/11.
 */
public class DeserializationExample {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        Company company=mapper.readValue(new File("d:/Test/company.json"),Company.class);
        System.out.print("company_name:"+company.getName()+"\t");
        System.out.print("headquarters:"+company.getHeadquarters()+"\t");
        System.out.println("birthDate:"+company.getBirthDate()); //birthDate被标记为
        Department[] departments = company.getDepartments();
        for (Department department : departments) {
            System.out.print("department_name:" + department.getName()+"\t");
            System.out.print("employee_number:" + department.getPm()+"\t");
            //Department中未定义的字段product,employee_number
            System.out.print("product:"+department.get("product")+"\t");
            System.out.println("projectManager:"+department.get("employee_number"));
        }
    }
}
