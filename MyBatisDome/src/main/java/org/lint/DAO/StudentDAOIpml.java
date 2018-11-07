package org.lint.DAO;

import org.StudentUtil.DAOUtil;
import org.apache.ibatis.session.SqlSession;
import org.lint.entity.Student;

import java.io.IOException;

public class StudentDAOIpml implements StudentDAO {
    SqlSession sqlSession =null ;
    @Override
    public int insertStudent(Student student) {
        int a = 0;
        try {
            sqlSession = DAOUtil.getSQLSession();
            a = sqlSession.insert("insertStudent",student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return a;
    }

    @Override
    public int insertStudentCatchID(Student student) {
        int a = 0;
        try {
            sqlSession = DAOUtil.getSQLSession();
            a = sqlSession.insert("insertStudentCatchID",student);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        return a;
    }
}
