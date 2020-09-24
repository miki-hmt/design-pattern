package com.miki.singleresponsibility;

public class Test {

    public static void main(String[] args) {

        //v1 非单一模式，飞行的鸟和走路的鸟混在一起
        Bird bird = new Bird();
        bird.mainmoveMode("大雁");
        bird.mainmoveMode("鸵鸟");

        //v2 改为单一职责模式，飞行鸟只用来飞行，走路鸟只用来走路，不混用。
        System.out.println("*********************版本2");
        FlyBird fbird = new FlyBird();
        fbird.mainmoveMode("大雁");

        WalkBird walkBird =new WalkBird();
        walkBird.mainmoveMode("鸵鸟");
    }
}
