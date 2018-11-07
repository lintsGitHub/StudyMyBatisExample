package org.lint.DAO;

import org.lint.Entity.CNews;
import org.lint.Entity.News;

import java.util.List;

public interface NewsDAO {
//    使用一对多的方式进行处理
//    查询指定栏目的所有子栏目
    List<News> seleNews(int pid);
//    查询指定栏目及其所有子孙栏目
    News seleNew(int pid);

//    使用多对一的方式进行处理
//    查询当前栏目及其所有父辈栏目
    CNews seleCNew(int id);


}
