package com.lpf.structure.decorator;

import com.lpf.entity.Bag;

/**
 * 这个是装饰者的基类
 */
public abstract class BagDecorator implements Bag {

    /**
     * 维持一个对 抽象构件对象的引用
     * 这个是想要增强的功能对象 将想要增强的功能对象传进来，然后才能进行功能增强
     */
    private Bag bag;

    /**
     * 注入一个抽象构件类型的对象
     * 将之前的对象传递进来，进行功能增强
     * @param bag
     */
    public BagDecorator(Bag bag) {
        this.bag = bag;
    }

    @Override
    public void pack() {
        bag.pack();
    }
}
