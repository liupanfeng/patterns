package com.lpf.create.fatory.abstractFactory;


import com.lpf.entity.Bag;
import com.lpf.entity.Fruit;

/**
 * 抽象水果工厂
 */
public abstract class AbstractFactory {

    public abstract Fruit getFruit();

    public abstract Bag getBag();

}
