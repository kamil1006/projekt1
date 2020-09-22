package com.komowo.projekt1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(public String pokaGgrupy(..)) ")
    public void beforeJeden(){
        System.out.println("\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*\n*");
    }

    @Before("execution(public * findAll(..)) ")
    public void beforeDwa(){
        System.out.println("\n++++\n++++\n++++\n++++\n++++\n++++\n++++\n++++");
    }

}
