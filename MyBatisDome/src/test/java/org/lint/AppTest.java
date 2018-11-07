package org.lint;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.lint.DAO.StudentDAOIpml;
import org.lint.entity.Student;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
   public void test(){
        StudentDAOIpml studentDAOIpml = new StudentDAOIpml();
        int a = studentDAOIpml.insertStudent(new Student("lint",22, (float) 67.6));
        System.out.println(a);
    }
    @Test
    public void test1(){
        Student student = new Student("lint", 22, (float) 67.6);
        System.out.println(student);
        StudentDAOIpml studentDAOIpml = new StudentDAOIpml();
        int a = studentDAOIpml.insertStudentCatchID(student);
        System.out.println(student);
    }
}
