package com.lpf.action.command;

import com.lpf.action.command.command.DiscountCommand;
import com.lpf.action.command.command.HotCommand;
import com.lpf.action.command.command.NewerCommand;

public class CommandClient {

    public static void main(String[] args) {
        /*三个命令，代表三个请求*/
        Command command1,command2,command3;
        command1 = new HotCommand();
        command2 = new NewerCommand();
        command3 = new DiscountCommand();

        ListView listView;
        listView = new ListView();
        listView.setCommand(command1);

        listView.getList();

    }

}
