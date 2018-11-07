package org.lint.DAO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lint.Entity.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentDAOImpl implements StudentDAO  {
    SqlSession sqlSession ;
    @Override
    public List<Student> seleStu() {
        try {
            InputStream resource = Resources.getResourceAsStream("MyBatisConfig.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
            sqlSession = build.openSession();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSession.selectList("seleStu");
    }
}
