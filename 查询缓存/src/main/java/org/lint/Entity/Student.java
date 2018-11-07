package org.lint.Entity;

import java.io.Serializable;

public class Student {
    int id;
    String name;
    int age;
    double sroce;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sroce=" + sroce +
                '}';
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
