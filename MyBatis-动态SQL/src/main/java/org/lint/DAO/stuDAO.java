package org.lint.DAO;

import org.lint.beans.Student;

import java.util.List;

public interface stuDAO {
    List<Student> seleStu(Student student);
    List<Student> seleStuChoose(Student student);
    List<Student> seleStuForeach(int[] ids);
}
