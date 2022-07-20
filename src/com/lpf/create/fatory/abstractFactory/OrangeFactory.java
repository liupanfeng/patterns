package com.lpf.create.fatory.abstractFactory;

import com.lpf.entity.Bag;
import com.lpf.entity.Fruit;
import com.lpf.entity.bag.OrangeBag;
import com.lpf.entity.fruit.Orange;

/**
 * 水果工厂
 */
public class OrangeFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Orange("Peter",50);
    }

    @Override
    public Bag getBag() {
        return new OrangeBag();
    }
}
