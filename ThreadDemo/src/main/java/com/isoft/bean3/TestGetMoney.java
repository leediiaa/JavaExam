package com.isoft.bean3;

import java.util.Scanner;

/*模拟银行取款*/
class Account{
    String name;
    double money;
    public Account(){
        System.out.println("请输入账户姓名：");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println("请输入开户金额：");
        money=sc.nextDouble();
    }
    public void draw(double money){
        this.money-=money;
    }
    public double getmoney(){
        return money;
    }
    public String getName(){
        return name;
    }
}
public class TestGetMoney {
    public static void main(String[] args) {
        Account account=new Account();
        Bank bank=new Bank(account,"中国银行");
        new Thread(bank,"窗口一").start();
        new Thread(bank,"窗口二").start();
        new Thread(bank,"窗口三").start();
        new Thread(bank,"窗口四").start();
    }
}
