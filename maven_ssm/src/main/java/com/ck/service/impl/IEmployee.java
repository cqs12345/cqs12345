package com.ck.service.impl;

import com.ck.dao.IEmployeeDao;
import com.ck.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/14 10:16
 */
@Service
public class IEmployee implements IEmployeeDao {
    @Autowired
    private IEmployeeDao iEmployeeDao;
    @Override
    public List<Employee> queryAll(){
        return iEmployeeDao.queryAll();
    }
}
