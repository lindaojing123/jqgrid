package com.baizhi.service;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService
{
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> findAll(Integer page,Integer rows) {
        /**
         * 计算每页的第一条和最后一条
         */
        Integer begin = (page-1)*rows+1;
        Integer end = page*rows;

        return empDao.selectAll(begin,end);
    }

    @Override
    public Integer records() {
        return empDao.records();
    }

    @Override
    public Integer total(Integer rows) {
        /**
         * 计算总页数： 信息总条数/ 每页展示的条数
         */
        Integer records = empDao.records();
        Integer total = null;
        if (records%rows==0) {
            total = records/rows;
        } else {
            total = records/rows+1;
        }
        return total;
    }
}
