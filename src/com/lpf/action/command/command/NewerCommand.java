package com.lpf.action.command.command;


import com.lpf.action.command.Command;
import com.lpf.action.command.handler.NewerHandler;

public class NewerCommand extends Command {
    /**
     * 命令模式绑定一个固定的操作
     */
    private NewerHandler handler = new NewerHandler();

    @Override
    public String execute() {
        return handler.getNewers();
    }
}
