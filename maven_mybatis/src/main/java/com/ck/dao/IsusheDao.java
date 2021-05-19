package com.ck.dao;

import com.ck.entity.teacher;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/13 10:08
 */
public interface IsusheDao {

    @Select("select * from teacher")
    @ResultMap("Users")
    public List<teacher> select();

}
