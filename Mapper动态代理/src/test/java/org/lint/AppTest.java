package org.lint;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.lint.DAO.StuDAO;
import org.lint.Entity.Student;

import java.io.IOException;
import java.io.InputStream;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private StuDAO stuDAO;  //stuDAO = {$Proxy} "org.apache.ibatis.binding.MapperProxy@158a8276" 这是一个JDK动态代理
    SqlSession sqlSession;

    @Before
    public void getSQLSession() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("config/MyBatisConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test() {

        stuDAO = sqlSession.getMapper(StuDAO.class);

        stuDAO.insertStu(new Student("李四",45,56));

        sqlSession.commit();
    }
    @After
    public void close(){
        if(sqlSession != null)
            sqlSession.close();
    }
}
