package com.isoft.bean2;
class TicketOffice implements Runnable{
    Object obj;
    int tickstCount;
    public TicketOffice(Object obj,int ticketsCount){
        this.obj=obj;
        this.tickstCount=ticketsCount;
    }


    public void run(){
        synchronized (obj) {
        while(tickstCount>=0){
                if (tickstCount == 0) {
                    System.out.println("没有票了，停止售卖。");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "售票点买了一张，还剩" + --tickstCount + "张票");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
public class TestTicketDemo {
    public static void main(String[] args) {
        TicketOffice ticketOffice = new TicketOffice("中国高铁", 10);
        new Thread(ticketOffice,"天津高铁").start();
        new Thread(ticketOffice,"北京高铁").start();
        new Thread(ticketOffice,"重庆高铁").start();

    }
}
