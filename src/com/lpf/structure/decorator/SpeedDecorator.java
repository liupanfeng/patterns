package com.lpf.structure.decorator;

import com.lpf.entity.Bag;

/**
 * 加急功能增强
 */
public class SpeedDecorator extends BagDecorator {

    /**
     * 注入一个抽象构件类型的对象
     * 将之前的对象传递进来，进行功能增强
     *
     * @param bag
     */
    public SpeedDecorator(Bag bag) {
        super(bag);
    }

    @Override
    public void pack() {
        super.pack();
        speedy();
    }

    /**
     * 快件加急
     */
    public void speedy() {
        System.out.println("------");
        System.out.println("打上加急标识");
    }
}