package com.miki.abstractfactory.v1;

/**
 * java视频类
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制java视频");
    }
}
