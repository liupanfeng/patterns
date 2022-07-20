package com.lpf.create.fatory.fatoryMethod;


import com.lpf.entity.Fruit;

/**
 * 工厂方法接口
 */
public interface FruitFactory {

    /**
     * 摘水果行为
     * @return
     */
    public Fruit getFruit();
}
