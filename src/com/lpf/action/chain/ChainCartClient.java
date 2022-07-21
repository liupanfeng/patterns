package com.lpf.action.chain;

import com.lpf.action.template.OtherPayShopping;
import com.lpf.action.template.ShoppingCart;
import com.lpf.create.fatory.simple.StaticFactory;
import com.lpf.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class ChainCartClient {

    /*初始化满减优惠券  满减没有下一个节点 是最后一个节点*/
    private static MultyDiscount multyDiscount = new FullMultyDiscount(null);
    static {
        /*新用户减免优惠是 满减优惠*/
        multyDiscount = new NewerMultyDiscount(multyDiscount);
        /*第二单打折扣的下一个节点是新用户减免*/
        multyDiscount = new SecondMultyDiscount(multyDiscount);
        /*假日的下一个节点是 第二单打折扣*/
        multyDiscount = new HolidayMultyDiscount(multyDiscount);
    }

    public static void main(String[] args) {
        List<Fruit> products = new ArrayList();

        products.add(StaticFactory.getFruitApple());
        products.add(StaticFactory.getFruitBanana());
        products.add(StaticFactory.getFruitOrange());

        ShoppingCart cart = new OtherPayShopping(products);

        /*注入优惠方案*/
        cart.setDiscount(multyDiscount);
        cart.submitOrder();
    }

}
