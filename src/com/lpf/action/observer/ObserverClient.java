package com.lpf.action.observer;

/**
 * 观察者模式
 */
public class ObserverClient {

    public static void main(String[] args) {
        MangoAttention attentions = new MangoAttention();//目标

        attentions.add(new SoulMasterObserver("唐三"));
        attentions.add(new SoulMasterObserver("马红俊"));
        attentions.add(new SoulMasterObserver("小舞"));
        attentions.add(new SoulMasterObserver("宁荣荣"));

        attentions.perform();

    }

}
