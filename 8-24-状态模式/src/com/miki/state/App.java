package com.miki.state;

/**
 * @ClassName App
 * @Description TODO 应用层模拟：场景：网站学习视频的状态转换，播放，暂停，停止，加速
 * @Author miki
 * @Date 2020/4/1 15:42
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());

        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());
        courseVideoContext.pause();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态："+courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
    }
}
