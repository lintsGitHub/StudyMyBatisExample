package org.lint.entity;

public class TClass {
    private int classid;
    private String name;

    @Override
    public String toString() {
        return "TClass{" +
                "classid=" + classid +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
