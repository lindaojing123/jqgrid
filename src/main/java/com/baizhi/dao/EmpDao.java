package com.baizhi.dao;

import com.baizhi.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpDao {

    List<Emp> selectAll(@Param("begin") Integer begin,
                        @Param("end") Integer end);

    // 查询信息总记录数
    Integer records();
}
