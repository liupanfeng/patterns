package com.lpf.structure.facade;

import com.lpf.create.fatory.abstractFactory.AbstractFactory;
import com.lpf.create.fatory.abstractFactory.AppleFactory;
import com.lpf.entity.Bag;
import com.lpf.structure.decorator.CheckedBagDecorator;
import com.lpf.structure.decorator.ReinforceBagDecorator;
import com.lpf.structure.decorator.SpeedDecorator;

public class PackService {

    /**
     * 水果打包：防伪/加固/加急等
     */
    public void doPack(){
        AbstractFactory factory = new AppleFactory();

        /*得到包装*/
        Bag bag = factory.getBag();

        /*现需要增加防伪标识*/
        /*防伪功能*/
        bag = new CheckedBagDecorator(bag);
        /*加固功能*/
        bag = new ReinforceBagDecorator(bag);
        /*加急功能*/
        bag = new SpeedDecorator(bag);

        bag.pack();
    }

    public void doSomeThine(){
        System.out.println("doSomeThine");
    }

}
