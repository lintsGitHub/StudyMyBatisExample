package org.lint.DAO;

import org.lint.entity.Student;

public interface StudentDAO {
    int insertStudent(Student student);
    int insertStudentCatchID(Student student);
    
}
