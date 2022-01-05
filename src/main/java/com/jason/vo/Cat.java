package com.jason.vo;

public class Cat {
    private String name;
    private String sex;
    private Integer id;

    public Cat(String name, String sex, Integer id) {
        this.name = name;
        this.sex = sex;
        this.id = id;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", id=" + id +
                '}';
    }
}
