package com.lpf.action.strategy;

/**
 * 第二单8折优惠
 */
public class SecondDiscount implements Discount {
    @Override
    public int calculate(int money) {
        Double balance =  money * 0.8;
        return balance.intValue();
    }
}
