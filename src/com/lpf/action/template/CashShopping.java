package com.lpf.action.template;


import com.lpf.entity.Fruit;

import java.util.List;

/**
 * 模板方法模式
 * 现金
 */
public class CashShopping extends ShoppingCart{

    public CashShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("现金结算，假一罚十");
    }
}
