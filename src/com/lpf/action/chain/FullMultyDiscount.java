package com.lpf.action.chain;

public class FullMultyDiscount extends MultyDiscount{

    /**
     * 通过构造函数 将下一个节点链接起来
     *
     * @param nextMultyDiscount
     */
    public FullMultyDiscount(MultyDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        /*先执行满减操作*/
        if (money > 200){
            System.out.println("优惠满减20元");
            money = money - 20;
        }
        /*父类的方法执行的是成员变量的优惠方案，也就是节点的优惠方案*/
        return super.calculate(money);
    }
}
