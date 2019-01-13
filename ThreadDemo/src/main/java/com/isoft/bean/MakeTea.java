package com.isoft.bean;

public class MakeTea {
    public static void main(String[] args) {
        BoilThread boilThread;
        washThread washThread;
        boilThread = new BoilThread();
        washThread = new washThread();
        boilThread.start();
        washThread.start();
    }
    //final void setDaemon(blooean on) 设置为后台线程
}
