package com.lpf.create.fatory.abstractFactory;


import com.lpf.entity.Bag;
import com.lpf.entity.Fruit;
import com.lpf.entity.bag.AppleBag;
import com.lpf.entity.fruit.Apple;

/**
 * 苹果工厂
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Bag getBag() {
        return new AppleBag();
    }
}
