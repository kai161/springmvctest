package com.bean;

import org.springframework.stereotype.Service;

/**
 * Created on 2017/4/24.
 */
@Service
public class CompantScan1 {

    private String student1;

    public String getStudent1() {
        return student1;
    }

    public void setStudent1(String student1) {
        this.student1 = student1;
    }

    public void sayCompantScan1(){
        System.out.println("this is CompantScan1");
    }
}
