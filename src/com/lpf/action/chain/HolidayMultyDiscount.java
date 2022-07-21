package com.lpf.action.chain;

/**
 * 假日一律减5元
 */
public class HolidayMultyDiscount extends MultyDiscount {

    /**
     * 公共的下一个节点 存放在父类节点上
     * @param nextMultyDiscount
     */
    public HolidayMultyDiscount(MultyDiscount nextMultyDiscount) {
        super(nextMultyDiscount);
    }

    @Override
    public int calculate(int money) {
        if (money > 20){
            System.out.println("假日一律减5元");
            money = money - 5;
        }
        return super.calculate(money);
    }
}
