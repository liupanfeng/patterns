package com.lpf.action.observer;

public class MangoAttention extends Attentions{

    @Override
    public void notifyObservers() {
        //遍历观察者集合
        for(Observer obs : observers) {
            obs.update();
        }
    }

    /*通知观察者*/
    public void perform(){
        this.notifyObservers();
    }
}
