package org.lint;

import static org.junit.Assert.assertTrue;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;
import org.lint.DAO.CityDAO;
import org.lint.DAO.NewsDAO;
import org.lint.DAO.ProvinceDAO;
import org.lint.DAO.StudentDAO;
import org.lint.Entity.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static SqlSession sqlSession;

    @BeforeClass
    public static void cl() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        sqlSession = build.openSession();

    }

    @Test
    public void test() {
        ProvinceDAO mapper = sqlSession.getMapper(ProvinceDAO.class);
        Province province = mapper.seleProvincebyID(1);
        System.out.println(province);
        Set<City> citys = province.getCitys();
        for (City city : citys) {
            System.out.println(city);
        }
    }

    @Test
    public void test1() {
        ProvinceDAO mapper = sqlSession.getMapper(ProvinceDAO.class);
        Province province = mapper.seleProvincebyID2(1);
        System.out.println(province);
        Set<City> citys = province.getCitys();
        for (City city : citys) {
            System.out.println(city);
        }
    }

    @Test
    public void test2() {
        CityDAO mapper = sqlSession.getMapper(CityDAO.class);
        List<City> province = mapper.seleProvincebyID(1);
        for (City city : province) {
            System.out.println(city);
        }

    }

    @Test
    public void test3() {
        CityDAO mapper = sqlSession.getMapper(CityDAO.class);
        List<City> province = mapper.seleProvincebyID2(1);
        for (City city : province) {
            System.out.println(city);
        }

    }
    @Test
    public void test4() {
        NewsDAO mapper = sqlSession.getMapper(NewsDAO.class);
        List<News> province = mapper.seleNews(2);
        for (News news : province) {
            System.out.println(news);
        }

    }
    @Test
    public void test5() {
        NewsDAO mapper = sqlSession.getMapper(NewsDAO.class);
        News province = mapper.seleNew(2);
        System.out.println(province);

    }
    @Test
    public void test6() {
        NewsDAO mapper = sqlSession.getMapper(NewsDAO.class);
        CNews province = mapper.seleCNew(5);
        System.out.println(province);
    }
    @Test
    public void test7() {
        StudentDAO mapper = sqlSession.getMapper(StudentDAO.class);
        Student province = mapper.seleStu(1);
        System.out.println(province);
    }
}
