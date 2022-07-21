package com.lpf.action.template;


import com.lpf.action.strategy.Discount;
import com.lpf.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 模板方法模式：真个算法过程是固定的，但是有一些步骤是未知的，需要延迟到子类去实现，需要延迟到子类的需要定义为抽象方法，这就是模板设计模式的
 * 购物车费用结算过程
 *
 * 结算的方式是用户的行为  这个只有当用户真正结算的时候才只能得知，所以需要延迟到子类去实现
 */
public abstract class ShoppingCart {
    /**
     * 折扣
     */
    private Discount discount;
    /**
     * 购买水果集合
     */
    private List<Fruit> products = new ArrayList<>();

    public ShoppingCart(List<Fruit> products){
        this.products = products;
    }
    /**
     * 注入不同的优惠方案
     * @param discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    /**
     * 提交订单主流程
     */
    public void submitOrder(){
        /*计算商品金额*/
        int money = balance();
        System.out.println("商品总金额为："+money+"元");

        /*优惠减免*/
        money = discount.calculate(money);
        System.out.println("优惠减免后："+ money+"元，");

        /*保存订单*/
        pay(money);

        /*送货上门*/
        sendHome();

    }

    /**
     * 计算金额
     * @return
     */
    private int balance(){
        int money = 0;
        System.out.print("商品清单：");
        for (Fruit fruit : products){
            fruit.draw();
            System.out.print(",");
            money += fruit.price();
        }
        return money;
    }

    private void sendHome(){
        System.out.println("三公里以内，免费送货上门");
    }

    /**
     * 支付方式 是用户行为，是用户真正支付的时候才知道的
     * 所以需要延迟到子类去实现
     * @param money
     */
    protected abstract void pay(int money);

}
