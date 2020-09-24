package com.miki.demeter;

/**
 * 应用层伪代码
 * 功能：boss对象下命令给领导去查看课程的数量
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader leader = new TeamLeader();

        //v1
        //无设计模式的普通代码
        boss.commandCheckNumber(leader);

        //v2
        //迪米特法则  尽量减少boss类对外部类的依赖，应该不让boss类中引入课程类
        boss.commandCheckNumberV2(leader);
    }
}
