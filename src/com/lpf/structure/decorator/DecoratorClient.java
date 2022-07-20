package com.lpf.structure.decorator;

import com.lpf.create.fatory.abstractFactory.AbstractFactory;
import com.lpf.create.fatory.abstractFactory.AppleFactory;
import com.lpf.entity.Bag;
import com.lpf.entity.Fruit;

public class DecoratorClient {

    public static void main(String[] args){
        AbstractFactory factory = new AppleFactory();
        /*得到水果*/
        Fruit fruit = factory.getFruit();
        fruit.draw();
        /*得到包装*/
        Bag bag = factory.getBag();

        /*下面是对包装进行装饰的过程（也就是功能增强的过程）*/

        /*现需要增加防伪标识*/
        bag = new CheckedBagDecorator(bag);
        /*加固功能*/
        bag = new ReinforceBagDecorator(bag);
        /*加急功能*/
        bag = new SpeedDecorator(bag);

        bag.pack();
    }

    public static void sendFruit(){


    }



}
