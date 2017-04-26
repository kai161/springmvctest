package com.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created on 2017/4/21.
 */
public class BeanFactoryTest implements BeanFactoryPostProcessor {

    private String code;
    private String test;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }


    public void say(){
        System.out.println("this is BeanFactoryTest");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("this is BeanFacotryPostProcessor!");

    }
}
