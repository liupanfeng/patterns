package com.lpf.create.fatory.abstractFactory;


import com.lpf.entity.Bag;
import com.lpf.entity.Fruit;
import com.lpf.entity.bag.BananaBag;
import com.lpf.entity.fruit.Banana;

/**
 * 水果工厂
 */
public class BananaFactory extends AbstractFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Bag getBag() {
        return new BananaBag();
    }
}
