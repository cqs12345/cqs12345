package com.ck;

import com.ck.dao.impl.IsushedaoImpl;
import com.ck.entity.teacher;
import org.junit.Test;

import java.util.List;

/**
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/13 10:48
 */
public class Mytest1 {
    @Test
    public void test1(){
        IsushedaoImpl dao = new IsushedaoImpl();
        List<teacher> list = dao.select();
        System.out.println(list);
    }



}
