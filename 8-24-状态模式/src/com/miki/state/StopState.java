package com.miki.state;

/**
 * @ClassName StopState
 * @Description TODO 停止状态实体
 * @Author miki
 * @Date 2020/4/1 15:49
 * @Version 1.0
 */
public class StopState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频状态");
    }
}
