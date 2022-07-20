package com.lpf.create.fatory.fatoryMethod;


import com.lpf.entity.Fruit;
import com.lpf.entity.fruit.Apple;

/**
 * 苹果工厂
 */
public class AppleFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Apple();
    }
}
