package com.isoft.bean3;

import java.util.Scanner;

public class Bank extends Thread{
    Account account;
    Object obj;
    Scanner scanner;
    public Bank(Account account,Object obj){
        scanner=new Scanner(System.in);
        this.account=account;
        this.obj=obj;
    }
    public void run(){
    synchronized (obj){
        while(account.getmoney()>0){
            System.out.println("请"+Thread.currentThread().getName()+"进行取款");
            System.out.println("请输入要取款的金额：");
            double drawMoney=scanner.nextDouble();
            if(account.getmoney()<drawMoney){
                System.out.println("账户余额不足，剩余金额为："+account.getmoney()+"元");
            }else{
                account.draw(drawMoney);
                System.out.println(account.getName()+"成功取款"+drawMoney+"元，" +
                        "剩余金额为："+account.getmoney()+"元");
                break;
            }
        }
    }
    }
}
