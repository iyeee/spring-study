package com.k.dit;

import org.aspectj.lang.annotation.Before;

public class DitPoint {
    @Before("execution(* com.k.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("-----qiqan");
    }
    public void after(){
        System.out.println("hou----");
    }
}
