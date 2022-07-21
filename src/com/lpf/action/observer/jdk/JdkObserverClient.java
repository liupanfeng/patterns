package com.lpf.action.observer.jdk;

public class JdkObserverClient {

    public static void main(String[] args) {
        War war = new War(":战争");

        war.addObserver(new SoulMaster("唐三"));
        war.addObserver(new SoulMaster("马红俊"));
        war.addObserver(new SoulMaster("小舞"));
        war.addObserver(new SoulMaster("宁荣荣"));

        war.perform();

    }


}
