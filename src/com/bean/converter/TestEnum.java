package com.bean.converter;


/**
 * Created on 2017/9/15.
 */
public enum TestEnum {
    Java("name","java");

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    TestEnum(String name, String value){
        this.name=name;
        this.value=value;
    }
}
