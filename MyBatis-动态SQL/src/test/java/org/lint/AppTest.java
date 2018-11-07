package org.lint;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lint.DAO.stuDAO;
import org.lint.beans.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static SqlSessionFactory build;
    static SqlSession sqlSession;

    @BeforeClass
    public static void cla() throws IOException {
        InputStream resource = Resources.getResourceAsStream("MyBatisConfig/MyBatisConfig.xml");
        build = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = build.openSession();
    }

    @Test
    public void stuDAO() {
        stuDAO mapper = sqlSession.getMapper(stuDAO.class);
        List<Student> students = mapper.seleStu(new Student());
        for (Student student : students) {
            System.out.println(student);
        }
    }
    @Test
    public void stuDAOForeach() {
        int[] ids = {1,3,4,17,19};
        stuDAO mapper = sqlSession.getMapper(stuDAO.class);
        List<Student> students = mapper.seleStuForeach(ids);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
