package org.lint;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.lint.DAO.StudentDAOImpl;
import org.lint.Entity.Student;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        StudentDAOImpl studentDAO = new StudentDAOImpl();
        List<Student> students = studentDAO.seleStu();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
