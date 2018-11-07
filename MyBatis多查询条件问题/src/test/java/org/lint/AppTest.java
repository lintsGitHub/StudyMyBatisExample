package org.lint;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lint.DAO.StuDAO;
import org.lint.Entity.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static SqlSessionFactory build;
    static SqlSession sqlSession;

    @BeforeClass
    public static void init() throws IOException {
        InputStream resource = Resources.getResourceAsStream("MyBaitsConfig.xml");
        build = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = build.openSession();
    }

    /*
    * 需求：
    * 名字为张三 ，但年龄要大于客户传过来的那个学生的年龄
    * */
//    使用map来做
    @Test
    public void selestu() {
        Student stu = new Student("李四", 22, 89);
        Map<String,Object> map = new HashMap<>();
        map.put("name","张三");
        map.put("stu",stu);
        StuDAO mapper = sqlSession.getMapper(StuDAO.class);
        List<Student> students = mapper.seleStu(map);
        for (Student student : students) {
            System.out.println(student);
        }
    }

//    一样的需求用索引来做
    @Test
    public void seleCond() {
        StuDAO mapper = sqlSession.getMapper(StuDAO.class);
        List<Student> students = mapper.seleCond("张三",22);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
