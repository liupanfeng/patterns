package com.lpf.action.strategy;

/**
 * 假日折扣
 * 需要大于100
 */
public class HolidayDiscount implements Discount{
    @Override
    public int calculate(int money) {
        if (money > 100){
            return money - 10;
        }
        return money;
    }
}
