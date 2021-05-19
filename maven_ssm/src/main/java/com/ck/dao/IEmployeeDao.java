package com.ck.dao;

import com.ck.entity.Employee;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/14 9:59
 */
public interface IEmployeeDao {
    @Select("select * from s_tisi")
    @ResultMap("Employee")
    public List<Employee> queryAll();


}
