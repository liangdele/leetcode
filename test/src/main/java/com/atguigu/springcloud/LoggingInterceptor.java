package com.atguigu.springcloud;

import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInterceptor {

    public static void intercept(Object target, Method method, Object[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("Method " + method.getName() + " is starting...");

        try {
            // 执行目标方法
            method.invoke(target, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Method " + method.getName() + " finished. Time taken: " + (endTime - startTime) + "ms");
    }

}
