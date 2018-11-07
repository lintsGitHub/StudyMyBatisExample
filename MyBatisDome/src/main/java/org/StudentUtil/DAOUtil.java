package org.StudentUtil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DAOUtil {
    private static SqlSession sqlSession = null;

    public static SqlSession getSQLSession() throws IOException {
        if (sqlSession == null) {
            InputStream resourceAsStream = Resources.getResourceAsStream("config/MyBatis_config.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            sqlSession = build.openSession();
        }else {
            return sqlSession;
        }
        return sqlSession;
    }
}
