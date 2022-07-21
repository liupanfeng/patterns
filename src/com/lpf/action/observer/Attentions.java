package com.lpf.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 注意事项  被观察者  被观察者发出通知
 */
public abstract class Attentions {

    /**
     * 观察者列表
     */
    protected List<Observer> observers = new ArrayList();


    /**
     * 添加观察者
     * @param observer
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取消关注
     * @param observer
     */
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 被观察者发出通知 通知所有观察者  观察者可以做出相应的行为
     */
    public abstract void notifyObservers();
}
