package com.ck.dao.impl;

import com.ck.dao.IsusheDao;
import com.ck.entity.teacher;
import com.ck.util.Mybatisutil;
import com.mysql.cj.xdevapi.Session;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**es
 * @Descrition:
 * @Author caoqs
 * @Date 2021/5/13 10:10
 */
public class IsushedaoImpl {
    public List<teacher> select(){
        SqlSession session = Mybatisutil.openSession(false);
        IsusheDao isusheDao = session.getMapper(IsusheDao.class);

        return isusheDao.select();
    }
}
