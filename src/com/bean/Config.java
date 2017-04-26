package com.bean;

import com.bean.annotation.ConfigAnnotation;
import com.bean.annotation.ConfigItemAnnotation;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/4/26.
 */
@ConfigAnnotation
@Component
public class Config {

    @ConfigItemAnnotation(name = "config.time")
    public String time;

    @ConfigItemAnnotation(name="config.name")
    public String name;

    @ConfigItemAnnotation(name = "config.address")
    public String address;

    @ConfigItemAnnotation(name = "config.version")
    public String version;
}
