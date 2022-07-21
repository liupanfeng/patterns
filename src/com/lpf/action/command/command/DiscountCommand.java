package com.lpf.action.command.command;


import com.lpf.action.command.Command;
import com.lpf.action.command.handler.DiscountHandler;

public class DiscountCommand extends Command {
    /**
     * 命令模式绑定一个固定的操作
     */
    private DiscountHandler handler = new DiscountHandler();

    @Override
    public String execute() {
        return handler.getDiscounts();
    }
}
