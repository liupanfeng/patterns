package com.lpf.action.chain;

import com.lpf.action.strategy.Discount;

/**
 * 责任链实现的关键是 定义一个next节点  然后构建一个链式结构
 */
public abstract class MultyDiscount implements Discount {

    /**
     * 链的下一个节点
     */
    protected MultyDiscount nextMultyDiscount;

    /**
     * 通过构造函数 将下一个节点链接起来
     * @param nextMultyDiscount
     */
    public MultyDiscount(MultyDiscount nextMultyDiscount){
        this.nextMultyDiscount = nextMultyDiscount;
    }

    @Override
    public int calculate(int money) {
        if (nextMultyDiscount!=null){
            this.nextMultyDiscount.calculate(money);
        }
        return money;
    }
}
