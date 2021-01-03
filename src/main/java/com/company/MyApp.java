package com.company;

import com.company.domain.student;
import org.apache.ibatis.session.SqlSession;
import java.io.IOException;
import java.util.List;

public class MyApp {
    public static void main(String[] args) throws IOException {

        SqlSession sqlSession =MyBatisUtils.getSqlSession();
        String sqlId = "com.company.dao.StudenDao" + "." + "SelectStudent";
        List<student> studentList = sqlSession.selectList(sqlId);
        studentList.forEach(student -> System.out.println(student));
        sqlSession.close();
    }

}
