package com.lpf.create.fatory.fatoryMethod;


import com.lpf.entity.Fruit;
import com.lpf.entity.fruit.Banana;

/**
 * 香蕉工厂
 */
public class BananaFactory implements FruitFactory{
    public Fruit getFruit(){
        return new Banana();
    }
}
