package com.k.Log;

import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    @Before("execution(* com.k.service.UserServiceImpl.*(..))")

    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(objects.getClass().getName()+"de"+method.getName());


    }
}
