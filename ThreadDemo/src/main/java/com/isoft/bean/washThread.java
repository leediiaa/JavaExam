package com.isoft.bean;

import java.util.Scanner;

public class washThread extends Thread {
    public void run(){
        System.out.println("开始刷杯子...");
        int i=0;
        while(true){
            try {
                Thread.sleep(1500);
                Scanner sc=new Scanner(System.in);
                System.out.println("是否继续刷杯子：");
                int c=sc.nextInt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("刷了第"+i+++"个杯子");
            if(i==5){
                break;
            }
        }
        System.out.println("杯子刷完了，可以泡茶了");
    }
}
