package com.lpf.create.fatory.simple;

import com.lpf.entity.Fruit;
import com.lpf.entity.fruit.Apple;
import com.lpf.entity.fruit.Banana;
import com.lpf.entity.fruit.Orange;

/**
 * 简单工厂模式 --- 静态工厂模式
 */
public class StaticFactory {
    public static final int TYPE_APPLE = 1;//苹果
    public static final int TYPE_ORANGE = 2;//桔子
    public static final int TYPE_BANANA = 3;//香蕉

    public static Fruit getFruit(int type){
        if(TYPE_APPLE == type){
            return new Apple();
        } else if(TYPE_ORANGE == type){
           return new Orange("Peter",80);
        } else if(TYPE_BANANA == type){
            return new Banana();
        }
        return null;
    }

    /**
     * 多方法工厂
     * @return
     */
    public static Fruit getFruitApple(){
        return new Apple();
    }

    public static Fruit getFruitOrange(){
        return new Orange("Peter",80);
    }

    public static Fruit getFruitBanana(){
        return new Banana();
    }


}
