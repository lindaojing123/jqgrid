package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    private Integer id;//_empty
    private String name;
    private Double salary;
    private Integer age;
    private Dept dept;


}
