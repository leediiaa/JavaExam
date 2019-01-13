package com.isoft.bean;

public class BoilThread extends Thread{
    public void run(){
        System.out.println("开始烧水...");
            try {
                Thread.sleep(10000);
                System.out.println("水烧开了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

