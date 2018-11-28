package org.lint.beans;

import com.sun.istack.internal.NotNull;

public class Student {
    private Integer id;
    @NotNull
    private String name;
    private int age;

    private double sroce;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + sroce +
                '}';
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.sroce = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public double getSroce() {
        return sroce;
    }

    public void setSroce(double sroce) {
        this.sroce = sroce;
    }

    public Student() {
    }
}
