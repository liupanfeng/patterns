package com.lpf.action.chain;

/**
 * 第二单8折优惠
 */
public class SecondMultyDiscount extends MultyDiscount {
    public SecondMultyDiscount(MultyDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        System.out.println("第二单打8折");
        Double balance =  money * 0.8;
        return super.calculate(balance.intValue());
    }
}
