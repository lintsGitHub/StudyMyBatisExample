package org.lint.Entity;

import java.util.Set;

//这个是以多对一的方式进行定义的实体类
public class CNews {
    int id;
    String name;
    CNews news;
    Set<CNews> cNews;
    @Override
    public String toString() {
        return "CNews{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", news=" + news +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CNews getNews() {
        return news;
    }

    public void setNews(CNews news) {
        this.news = news;
    }
}
