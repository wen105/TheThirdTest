package com.shuyun.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by shuyun on 2016/8/12.
 * 代码简化工具
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private List<String> books;
}
