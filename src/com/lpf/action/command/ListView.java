package com.lpf.action.command;

public class ListView {

    /**
     * 维持一个抽象命令对象的引用
     */
    private Command command;

    /**
     * 为功能键注入命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 请求列表
     */
    public void getList() {
        System.out.print("首页请求");
        /*根据命令获取结果  不同的命令得到的结果就是不一样的*/
        String result = command.execute();
        System.out.println("当前列表："+result);
    }

}
