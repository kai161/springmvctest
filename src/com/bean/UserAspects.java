package com.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created on 2017/4/24.
 */

@Aspect
public class UserAspects {

    @Pointcut("execution(public * com.bean.BeanTest.*(..))")
    public void testAspects(){

    }

    @Before("testAspects()")
    public void beforeMethod(JoinPoint point){
        System.out.println("this is UserAspects"+point.toLongString());

        try {
           String target= point.toShortString();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }




}
