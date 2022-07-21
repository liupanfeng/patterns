package com.lpf.action.command.command;


import com.lpf.action.command.Command;
import com.lpf.action.command.handler.HotHandler;

public class HotCommand extends Command {
    /**
     * 命令模式绑定一个固定的操作
     */
    private HotHandler handler = new HotHandler();

    @Override
    public String execute() {
        return handler.getHots();
    }
}
