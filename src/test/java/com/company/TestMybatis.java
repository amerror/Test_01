package com.company;

import com.company.dao.StudenDao;
import com.company.domain.MyStudent;
import com.company.domain.student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void testinsert() throws IOException {
        String config = "mybatis.xml";
        InputStream in = Resources.getResourceAsStream(config);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession sqlSession = factory.openSession();
        String sqlId = "com.company.dao.StudenDao.insertStudent";
        student stu = new student();
        stu.setId(1003);
        stu.setName("藏非");
        stu.setEmail("zangfei@163.com");
        stu.setAge(23);
        int nums = sqlSession.insert(sqlId,stu);
        sqlSession.commit();
        System.out.println("执行insert的结果"+nums);
        sqlSession.close();
    }

    @Test
    public void testSelectMyStudent() throws Exception{
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudenDao dao = sqlSession.getMapper(StudenDao.class);
        List<MyStudent> students = dao.selectMyStudent();
        for(MyStudent stu : students){
            System.out.println(stu);
        }
        sqlSession.close();
    }
}
