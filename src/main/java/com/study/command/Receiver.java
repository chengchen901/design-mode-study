package com.study.command;

import java.util.HashMap;
import java.util.Map;

public class Receiver {
    private Map<String, Command> commands;

    public Receiver() {
        commands = new HashMap<>();
    }

    public void register(String strComm, Command command) {
        commands.put(strComm, command);
    }

    public void receive(String command) {
        Command commandObj = commands.get(command);
        if (commandObj != null) {
            commandObj.execute();
            return;
        }
        System.out.println("不支持此命令" + command);
    }
}
