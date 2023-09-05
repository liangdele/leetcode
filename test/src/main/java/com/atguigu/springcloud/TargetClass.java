package com.atguigu.springcloud;

public class TargetClass {

    @Loggable
    public void doSomething() {
        System.out.println("Doing something...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
