package com.lpf.structure.decorator;


import com.lpf.entity.Bag;

/**
 * 增加防伪标识
 */
public class CheckedBagDecorator extends BagDecorator{

    /**
     * 注入一个抽象构件类型的对象
     * 将之前的对象传递进来，进行功能增强
     *
     * @param bag
     */
    public CheckedBagDecorator(Bag bag) {
        super(bag);

    }

    @Override
    public void pack() {
        super.pack();  //调用原有业务方法
        checked();  //打印防伪标识
    }

    public void checked() {
        System.out.println("------");
        System.out.println("打印上防伪标识");
    }
}
