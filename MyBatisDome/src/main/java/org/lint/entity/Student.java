package org.lint.entity;

import java.util.List;

public class Student {
   private int id;
   private String name;
   private int age;
   private float sroce;

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    private List<Class> classes;
    public Student(String name, int age, float sroce) {
        this.name = name;
        this.age = age;
        this.sroce = sroce;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sroce=" + sroce +
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSroce() {
        return sroce;
    }

    public void setSroce(float sroce) {
        this.sroce = sroce;
    }
}
