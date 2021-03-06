package org.lint.Entity;

public class Student {
    private int id ;
    private String name ;
    private int age ;

    public Student(String name, int age, double sroce) {
        this.name = name;
        this.age = age;
        this.sroce = sroce;
    }

    public Student() {
    }

    private double sroce ;

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

    public double getSroce() {
        return sroce;
    }

    public void setSroce(double sroce) {
        this.sroce = sroce;
    }
}
