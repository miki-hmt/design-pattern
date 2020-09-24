package com.miki.factory.v1;

public class Test {

    public static void main(String[] args) {

        //v1
//        Video video = new JavaVideo();
//        video.produce();


        //v2
        //通过简单工厂模式生成java视频
//        VideoFactory factory = new VideoFactory();
//        Video java = factory.getVideo("java");
//        java.produce();

        //v3
        //使用反射实现简单工厂模式的升级
//        VideoFactory factory1 = new VideoFactory();
//        Video java1 = factory.getVideo(JavaVideo.class);
//        java1.produce();


        //v4
        //使用工厂模式实现,将实例化交给子类去实现，而不是用工厂对象去实现
        VideoFactory factory =new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();
    }
}
