package com.lpf.action.strategy;

/**
 * 折扣
 */
public interface Discount {
    /**
     * 计算价格
     * @param money
     * @return
     */
    public int calculate(int money);
}
