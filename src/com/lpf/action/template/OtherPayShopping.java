package com.lpf.action.template;


import com.lpf.entity.Fruit;

import java.util.List;

/**
 * 模板方法模式
 * 他人代付
 */
public class OtherPayShopping extends ShoppingCart{


    public OtherPayShopping(List<Fruit> products) {
        super(products);
    }

    @Override
    protected void pay(int money) {
        System.out.println("代付成功");
    }

}
