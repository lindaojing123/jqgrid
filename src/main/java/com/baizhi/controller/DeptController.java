package com.baizhi.controller;

import com.baizhi.entity.Dept;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @RestController 相当于  @Controller和@ResponseBody注解功能的组合
 */
@RestController
@RequestMapping("dept")
@Slf4j
public class DeptController {

    @RequestMapping("findAll")
    public String findAll() {
        List<Dept> depts = new ArrayList<>();
        depts.add(new Dept(1,"研发部"));
        depts.add(new Dept(2,"市场部"));
        depts.add(new Dept(3,"财务部"));
        depts.add(new Dept(4,"行政部"));
        depts.add(new Dept(5,"保洁部"));

        StringBuilder sbu = new StringBuilder("<select>");
        for (Dept dept : depts) {
            sbu.append("<option value='"+dept.getId()+"'>"+dept.getDeptName()+"</option>");
        }
        sbu.append("</select>");
        System.out.println(sbu.toString());
        return sbu.toString();
    }
}
