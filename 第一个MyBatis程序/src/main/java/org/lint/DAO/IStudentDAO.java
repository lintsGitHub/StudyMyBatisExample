package org.lint.DAO;

import org.apache.ibatis.annotations.Param;
import org.lint.beans.Student;

import java.util.List;

public interface IStudentDAO {
    void insertStu( Student student);
    Student stulist(String stuName);
    int deleStu(int id);
    List<Student> selestus();
}
