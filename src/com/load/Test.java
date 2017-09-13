package com.load;

import com.bean.BeanTest;
import com.bean.Config;
import com.bean.PropertiesReader;
import com.bean.javabean.DevBean;
import com.bean.javabean.ProductBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.Properties;

/**
 * Created on 2017/4/20.
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
//
//        classPathXmlApplicationContext.setAllowBeanDefinitionOverriding(true);
//
//        //classPathXmlApplicationContext.refresh();
//
//        BeanTest beanTest=(BeanTest) classPathXmlApplicationContext.getBean("test");
//
//        beanTest.say();
//        beanTest.setName("test");
//
//        Config config=(Config)classPathXmlApplicationContext.getBean("config");
//
//        System.out.println(config.name);
//        System.out.println(config.address);
//        System.out.println(config.time);
//        System.out.println(config.version);
//
//
//        PropertiesReader propertiesReader=(PropertiesReader) classPathXmlApplicationContext.getBean("propertiesReader");
//
//        System.out.println(propertiesReader.getName());
//        System.out.println(propertiesReader.getAddress());

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
        Properties properties=new Properties();
        properties.load(applicationContext.getClassLoader().getResourceAsStream("config.properties"));
        String profiles=properties.getProperty("config.profiles");
        applicationContext.getEnvironment().setActiveProfiles(profiles);
        //applicationContext.getEnvironment().setActiveProfiles("Product");
        applicationContext.register(DevBean.class, ProductBean.class);
        applicationContext.refresh();
        String[] beanName=applicationContext.getBeanDefinitionNames();
        String devBean=(String) applicationContext.getBean("productBeans");

    }
}
