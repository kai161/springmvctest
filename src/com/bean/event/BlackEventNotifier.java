package com.bean.event;

import org.springframework.context.ApplicationListener;

/**
 * Created on 2017/9/14.
 */
public class BlackEventNotifier implements ApplicationListener<BlackListEvent> {


    public String notifierAddr;

    public void setNotifierAddr(String notifierAddr) {
        this.notifierAddr = notifierAddr;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("this email is in blacklist "+ event.addr);
        System.out.println("please notification to "+ notifierAddr);
    }
}
