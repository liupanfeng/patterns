package com.lpf.create.fatory.fatoryMethod;


import com.lpf.entity.Bag;
import com.lpf.entity.bag.BananaBag;

/**
 * 工厂方法模式
 */
public class BananaBagFactory implements BagFactory{
    public Bag getBag(){
        return new BananaBag();
    }
}
