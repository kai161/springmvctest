package com.bean.javabean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created on 2017/9/13.
 */
@Configuration
@Profile("Product")
public class ProductBean {

    @Bean
    public String productBeans(){
        return "productBeans";
    }
}
