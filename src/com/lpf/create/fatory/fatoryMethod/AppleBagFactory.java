package com.lpf.create.fatory.fatoryMethod;


import com.lpf.entity.Bag;
import com.lpf.entity.bag.AppleBag;

/**
 * 工厂方法模式
 */
public class AppleBagFactory implements BagFactory{
    public Bag getBag(){
        return new AppleBag();
    }
}
