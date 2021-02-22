package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 相当于  MapperScannerConfigurer 的作用
@MapperScan("com.baizhi.dao") // 指定dao接口的包结构
public class JqgridApp {
    public static void main(String[] args) {
        SpringApplication.run(JqgridApp.class, args);
    }

}
