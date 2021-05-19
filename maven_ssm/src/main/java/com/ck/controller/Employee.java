package com.ck.controller;

import com.ck.service.impl.IEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/14 10:12
 */
@Controller
public class Employee {
    @Autowired
    private IEmployee iEmployee;
    @RequestMapping("queryAll")
    public String queryAll(ModelMap map){
        List<com.ck.entity.Employee> employees = iEmployee.queryAll();


        map.put("booklist",employees);
        return  "book";
    }
}
