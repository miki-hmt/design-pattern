package com.miki.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Staff
 * @Description TODO 执行命令类
 * @Author miki
 * @Date 2020/3/31 22:46
 * @Version 1.0
 */
public class Staff {

    private List<Command> commandList = new ArrayList<>();

    //追加命令的方法
    public void addCommand(Command command){
        commandList.add(command);
    }

    //执行全部命令
    public void executeCommands(){
        for (Command command :commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
