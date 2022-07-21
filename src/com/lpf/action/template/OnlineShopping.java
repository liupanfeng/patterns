package com.lpf.action.template;

import com.lpf.entity.Fruit;
import com.lpf.service.OrderService;
import com.lpf.service.impl.OrderServiceImpl;

import java.util.List;

/**
 * 模板方法模式
 * 微信支付结算
 */
public class OnlineShopping extends ShoppingCart{

    private OrderService orderService = new OrderServiceImpl();

    public OnlineShopping(List<Fruit> products) {
        super(products);
    }
    @Override
    protected void pay(int money) {
        System.out.println("微信/支付宝结算，减免5元,请支付："+(money - 5)+"元");
        int orderId = orderService.saveOrder();

    }
}
