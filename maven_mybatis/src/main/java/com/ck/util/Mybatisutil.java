package com.ck.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;


public class Mybatisutil {
    private static SqlSessionFactory build;

    static {
        try {
            InputStream resourceAsStream =
                    Resources.getResourceAsStream("mybatis-config.xml");
            build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
//    定义方法获取数据库操作对象SqlSession
//    需要事务transaction传true，否则传false
    public static SqlSession openSession(boolean bool){
        return  build.openSession(bool);

    }
}
