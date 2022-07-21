package com.lpf.action.observer.jdk;

import java.util.Observable;

public class War extends Observable {

    private String name;

    public War(String name){
        this.name = name;
    }

    public void perform(){
        /*先设置改变*/
        this.setChanged();
        /*然后通知*/
        this.notifyObservers();
    }
}
