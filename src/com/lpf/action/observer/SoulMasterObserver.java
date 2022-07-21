package com.lpf.action.observer;

/**
 * 观察者  各种各样的观察者
 */
public class SoulMasterObserver implements Observer {

    private String name;

    public SoulMasterObserver(String name){
        this.name = name;
    }

    /**
     * 观察者接收到通知做一些事情
     */
    @Override
    public void update() {
        System.out.println(name + "收到作战通知，赶往嘉陵关");
    }
}
