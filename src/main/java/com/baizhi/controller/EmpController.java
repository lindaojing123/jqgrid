package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @RestController 相当于  @Controller和@ResponseBody注解功能的组合
 */
@RestController
@RequestMapping("emp")
@Slf4j
public class EmpController {
//    private Logger log = LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpService empService;

    /**
     *
     * @param page 当前页码
     * @param rows 每页展示记录数
     * @return
     */
    @RequestMapping("findAll")
    public Map<String,Object> findAll(Integer page, Integer rows) {
        List<Emp> emps = empService.findAll(page,rows);
        // 使用日志调试项目
        log.debug("{}",emps);
        Map<String, Object> map = new HashMap<>();
        map.put("rows", emps);
        map.put("page",page);
        map.put("total", empService.total(rows));
        map.put("records", empService.records());
        return map;
    }

    /**
     *
     * @param oper  当前操作的类型，值为：  add/edit/del
     * @param emp 接收的请求参数
     * @return
     */
    @RequestMapping("edit")
    public Map<String,Object> edit(String oper,Emp emp) {
        System.out.println("edit："+emp);
        Map map = new HashMap();
        map.put("message", "ok");

        return map;
    }
}
