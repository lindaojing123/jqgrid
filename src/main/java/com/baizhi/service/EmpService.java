package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {

    List<Emp> findAll(Integer page,Integer rows);

    /*总条数*/
    Integer records();

    /*总页数*/
    Integer total(Integer rows);
}
