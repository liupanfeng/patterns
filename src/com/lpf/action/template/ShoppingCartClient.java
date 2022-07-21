package com.lpf.action.template;

import com.lpf.action.strategy.FullDiscount;
import com.lpf.create.fatory.simple.StaticFactory;
import com.lpf.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式
 * 订单费用结算过程
 */
public class ShoppingCartClient {


    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new CartShopping(products);

        /*注入优惠方案*/
        cart.setDiscount(new FullDiscount());

        cart.submitOrder();
    }


}
