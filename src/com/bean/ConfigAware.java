package com.bean;

import com.bean.annotation.ConfigAnnotation;
import com.bean.annotation.ConfigItemAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * Created on 2017/4/26.
 */
@Component
public class ConfigAware implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz=bean.getClass();
        if(clazz.isAnnotationPresent(ConfigAnnotation.class)){

            Properties properties=getPropertiesByPath("config.properties");
            Field[] fields=clazz.getFields();
            for(Field field:fields){
               ConfigItemAnnotation configItemAnnotation=field.getAnnotation(ConfigItemAnnotation.class);
                if(configItemAnnotation!=null){
                    String name=configItemAnnotation.name();
                    String value=properties.getProperty(name);
                    try {
                        if(value!=null){
                            field.setAccessible(true);
                            field.set(bean,value);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bean;
    }

    private Properties getPropertiesByPath(String path){
        Properties properties=new Properties();
        try {
            properties.load(this.getClass().getClassLoader().getResourceAsStream(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
