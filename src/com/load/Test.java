package com.load;

import com.bean.BeanTest;
import com.bean.Config;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2017/4/20.
 */
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");

        classPathXmlApplicationContext.setAllowBeanDefinitionOverriding(true);

        //classPathXmlApplicationContext.refresh();

        BeanTest beanTest=(BeanTest) classPathXmlApplicationContext.getBean("test");

        beanTest.say();
        beanTest.setName("test");

        Config config=(Config)classPathXmlApplicationContext.getBean("config");

        System.out.println(config.name);
        System.out.println(config.address);
        System.out.println(config.time);
        System.out.println(config.version);
    }
}
