package com.bean.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

/**
 * Created on 2017/9/14.
 */
public class EmailServer implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher myAppEventPublisher;
    public List<String> blackList;

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.myAppEventPublisher=applicationEventPublisher;
    }

    public void sendEmail(String email){
        if(blackList.contains(email)){
            BlackListEvent blackListEvent=new BlackListEvent(this,email);
            myAppEventPublisher.publishEvent(blackListEvent);
            return;
        }

        System.out.println("send email "+email);
    }
}
