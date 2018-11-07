package org.lint.DAO;

import org.lint.Entity.Student;

import java.util.List;
import java.util.Map;

public interface StuDAO {
    List<Student> seleStu(Map<String,Object> map);
    List<Student> seleCond(String name,int age);
}
