package com.miki.state;

/**
 * @ClassName PlayState
 * @Description TODO 播放状态实体
 * @Author miki
 * @Date 2020/4/1 15:49
 * @Version 1.0
 */
public class PlayState extends CourseVideoState{

    @Override
    public void play() {
        System.out.println("正常播放视频");
    }

    //正常播放状态下可以加速，暂停，停止
    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    //正常播放状态下可以加速，暂停，停止
    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    //正常播放状态下可以加速，暂停，停止
    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
