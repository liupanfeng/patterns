package com.lpf.structure.decorator;

import com.lpf.entity.Bag;

/**
 * 加固增强
 */
public class ReinforceBagDecorator extends BagDecorator {


    /**
     * 注入一个抽象构件类型的对象
     * 将之前的对象传递进来，进行功能增强
     *
     * @param bag
     */
    public ReinforceBagDecorator(Bag bag) {
        super(bag);
    }

    public void pack() {
        super.pack();  //调用原有业务方法
        reinforce();
    }

    //加固包装
    public void reinforce() {
        System.out.println("------");
        System.out.println("加固了包装");
    }
}
