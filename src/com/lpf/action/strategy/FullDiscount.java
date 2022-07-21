package com.lpf.action.strategy;

/**
 * 满减策略
 * 需要满200
 */
public class FullDiscount implements Discount{
    @Override
    public int calculate(int money) {
        if (money>200){
            System.out.println("符合满减策略，进行满减");
            return money - 30;
        }
        return money;
    }
}
