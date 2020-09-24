package com.miki.simplefactory.v1;

/**
 *@Author miki
 *@Description //TODO 模拟应用层代码，实现简单工厂模式代码
 *@Date 2020/2/25 22:29
 *@Param 
 *@Return 
 *@Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        //v1
        Video video = new JavaVideo();
        video.produce();


        //v2
        //通过简单工厂模式生成java视频
        VideoFactory factory = new VideoFactory();
        Video java = factory.getVideo("java");
        java.produce();

        //v3
        //使用反射实现简单工厂模式的升级
        VideoFactory factory1 = new VideoFactory();
        Video java1 = factory.getVideo(JavaVideo.class);
        java1.produce();
    }
}
