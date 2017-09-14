package com.bean.messagesource;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

/**
 * Created on 2017/9/14.
 */
public class MessageSourceBean implements MessageSourceAware {

    public MessageSource myMessageSource;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        myMessageSource=messageSource;
    }

    public void testMessage(){
        String messge= myMessageSource.getMessage("format.name",new Object[]{"hello"},null,null);
        System.out.println(messge);
    }
}
