package com.lpf.create.fatory.fatoryMethod;

import com.lpf.entity.Fruit;
import com.lpf.entity.fruit.Orange;

/**
 * 橘子工厂
 */
public class OrangeFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Orange("lpf",80);
    }
}
