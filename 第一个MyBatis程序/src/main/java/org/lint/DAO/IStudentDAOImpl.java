package org.lint.DAO;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lint.beans.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class IStudentDAOImpl implements IStudentDAO {
    private SqlSession sqlSession;

    @Override
    public void insertStu(Student student) {
        try {

//            1,加载配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
//            创建SqlSessionFactory对象
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            创建SqlSession对象
            sqlSession = sessionFactory.openSession();

//            进行相关操作
            sqlSession.insert("insertStu", student);

            //Student mapper = sqlSession.getMapper(Student.class);

//            设置提交，不然数据不会到数据库
            sqlSession.commit();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
        }
    }

    @Override
    public Student stulist(String stuName) {
        Student o = null ;
        try {

//            1,加载配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
//            创建SqlSessionFactory对象
//            这个对象是重量级对象，但它也是一个线程安全的对象
//            什么是线程安全？
//            它是单实例的，所有请求共享一个对象，并且这个对象中的属性是不可修改的
//            也就是说我们可以使用单例模式去创建这个对象
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//            创建SqlSession对象
            sqlSession = sessionFactory.openSession();
//            sqlSession = sessionFactory.openSession(true);
//            传一个参数，这个参数就是设置是否自动提交
//            进行相关操作
             o = this.sqlSession.selectOne("stulist",stuName);  //查询一行，也就是说，就算查出多行也只会返回第一行
//            sqlSession.selectList("stulist"); 查询返回一个list 集合
//            sqlSession.selectMap("stulist","name"); 第一个参数是mapper的映射ID，第二个参数是以对象的name属性作为主键添加到map

//            Student mapper = sqlSession.getMapper(Student.class);
//            如果是查询的话，我们就没有必要进行表单的提交了
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null)
                sqlSession.close();
//                看完源码后发现：
//                如果我们没有提交，它关闭就会回滚事务
        }
        return o ;
    }

    @Override
    public int deleStu(int id) {
        return 0;
    }

    @Override
    public List<Student> selestus() {
        return null;
    }
    /*
     * 疑问：（都可以看源码来解释）
     *   1，为什么SqlSession的提交是事务的提交？
     *   2, SqlSession既然有提交那就应该有回滚啊，为什么不用使用？
     *   3, 最后为什么要判断SqlSession不为空并关闭它？
     *   4, 我们在以前使用InputStream流的时候，到最后都要关闭它，现在为什么不用关闭？
     *      因为 build 方法在读完数据后就把InputStream 关闭了，也就是说build封装有关闭流的方法，我们就不用手动去关闭它
     * */
}
