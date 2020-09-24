package com.miki.singleresponsibility;

public class Bird {

    //鸟主要移动方式
    public void mainmoveMode(String birdName){
        if("鸵鸟".equals(birdName)){
            System.out.println(birdName+"用脚走");
        }else{
            System.out.println(birdName+"主要靠翅膀飞");
        }

    }
}
