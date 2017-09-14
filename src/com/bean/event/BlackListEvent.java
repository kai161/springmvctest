package com.bean.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created on 2017/9/14.
 */
public class BlackListEvent extends ApplicationEvent {

    public final String addr;
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public BlackListEvent(Object source,String addres) {
        super(source);
        this.addr=addres;
    }

}
