package com.zwt.test;

import com.zwt.mapper.userinfoDao;
import com.zwt.pojo.userInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class test {
    public static void main(String[] args) throws IOException {
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(config);
        SqlSession sqlSession=sessionFactory.openSession();

        userinfoDao userinfoDao=sqlSession.getMapper(userinfoDao.class);

        userInfo userInfo = new userInfo();
        userInfo.setUsername("zwt");
        userInfo.setPassword("123456");
        userinfoDao.insertUserinfo(userInfo);
        System.out.println(userinfoDao.selectAll());


    }
}
