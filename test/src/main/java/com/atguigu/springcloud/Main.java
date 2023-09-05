package com.atguigu.springcloud;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        TargetClass target = new TargetClass();
        Method method = null;

        try {
            method = target.getClass().getMethod("doSomething");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        if (method != null) {
            LoggingInterceptor.intercept(target, method, null);
        }
    }
}
