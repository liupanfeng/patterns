package com.lpf.action.strategy;

/**
 * 新用户减免
 * 但是也需要大于100
 */
public class NewerDiscount implements Discount{
    @Override
    public int calculate(int money) {
        if (money>100){
            return money-20;
        }
        return money;
    }
}
