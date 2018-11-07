package org.lint;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.lint.Entity.Student;

import java.util.List;

public interface StuDAO {
//    public @interface Select {
//        String[] value();
//    }
//    这个是注解的源码可以看到可以传一个字符串数组
//    这样写的话mapper文件就没有什么用了
//    @Select(value = {"select id,name,age,sroce from student"})
    List<Student> seleAllStu();
//    @Select("select id,name,age,sroce from student")
    List<Student> seleAllStu2();
    List<Student> seleAllStu3();
    List<Student> seleAllStu4();
}
