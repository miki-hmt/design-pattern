package com.miki.abstractfactory.v1;

/**
 * python视频产品
 */
public class PythonVideo extends Video{
    @Override
    public void produce() {
        System.out.println("开始录制python视频");
    }
}
