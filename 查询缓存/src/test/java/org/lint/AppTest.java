package org.lint;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lint.Entity.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static SqlSession sqlSession;

    @BeforeClass
    public static void toclass() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = build.openSession();
    }

    //    验证一级缓存是存在的
    @Test
    public void check() {
        StuDAO mapper = sqlSession.getMapper(StuDAO.class);
        System.out.println(mapper.seleAllStu());
        System.out.println(mapper.seleAllStu2());
//        清除sqlsession中的缓存
        sqlSession.clearCache();
        System.out.println(mapper.seleAllStu());
//        打印出来的结果
       /* 1024 DEBUG [main]            org.lint.StuDAO.seleAllStu     - ==>  Preparing: select id , name,age,sroce from student
        1093 DEBUG [main]            org.lint.StuDAO.seleAllStu     - ==> Parameters:
        1155 DEBUG [main]            org.lint.StuDAO.seleAllStu     - <==      Total: 5
        [Student{id=17, name='张三', age=23, sroce=89.0}, Student{id=18, name='张三', age=23, sroce=89.0}, Student{id=19, name='张三', age=23, sroce=89.0}, Student{id=20, name='张三', age=23, sroce=89.0}, Student{id=21, name='张三', age=23, sroce=89.0}]
        1161 DEBUG [main]           org.lint.StuDAO.seleAllStu2     - ==>  Preparing: select id , name,age,sroce from student
        1162 DEBUG [main]           org.lint.StuDAO.seleAllStu2     - ==> Parameters:
        1164 DEBUG [main]           org.lint.StuDAO.seleAllStu2     - <==      Total: 5
        [Student{id=17, name='张三', age=23, sroce=89.0}, Student{id=18, name='张三', age=23, sroce=89.0}, Student{id=19, name='张三', age=23, sroce=89.0}, Student{id=20, name='张三', age=23, sroce=89.0}, Student{id=21, name='张三', age=23, sroce=89.0}]
        [Student{id=17, name='张三', age=23, sroce=89.0}, Student{id=18, name='张三', age=23, sroce=89.0}, Student{id=19, name='张三', age=23, sroce=89.0}, Student{id=20, name='张三', age=23, sroce=89.0}, Student{id=21, name='张三', age=23, sroce=89.0}]
*/
//       在这里可以看出第二次去查的时候，就不会去到数据库中去查找数据了
    }

//    检验二级缓存存在
//    开启内置的二级缓存
//    第一步对实体进行序列化
//    在映射文件中添加cache标签
    @Test
    public void tocheck(){
//        也就发送了一条查询语句到后台
//        Cache Hit Ratio [org.lint.StuDAO]: 0.0   -- 这是查询命中率
        StuDAO mapper = sqlSession.getMapper(StuDAO.class);
        StuDAO mapper2 = sqlSession.getMapper(StuDAO.class);
        mapper.seleAllStu3();
        mapper2.seleAllStu3();
    }

    @AfterClass
    public static void end() {

        sqlSession.close();
    }
}
