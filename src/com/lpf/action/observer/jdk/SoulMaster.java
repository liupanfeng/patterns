package com.lpf.action.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class SoulMaster implements Observer {

    private String name;

    public SoulMaster(String name){
        this.name = name;
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + "收到作战通知，赶往嘉陵关");
    }
}
