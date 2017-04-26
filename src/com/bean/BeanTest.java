package com.bean;

/**
 * Created on 2017/4/20.
 */
public class BeanTest {

    private String name;

    private String age;

    public void say(){
        System.out.println("hello world!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
