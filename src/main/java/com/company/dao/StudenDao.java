package com.company.dao;

import com.company.domain.MyStudent;
import com.company.domain.student;

import java.util.List;

public interface StudenDao {

    public List<student> SelectStudent();

    public int insertStudent(student student);

    public List<MyStudent> selectMyStudent();
}
