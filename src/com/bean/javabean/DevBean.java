package com.bean.javabean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created on 2017/9/13.
 *
 * 通过使用注解来实现容器具体装载的bean
 */
@Configuration
@Profile("DEV")
public class DevBean {

    @Bean
    public String devBeans(){
        return "devBeans";
    }
}
