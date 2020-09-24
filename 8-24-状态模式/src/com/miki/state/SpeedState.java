package com.miki.state;

/**
 * @ClassName SpeedState
 * @Description TODO 加速状态实体
 * @Author miki
 * @Date 2020/4/1 15:49
 * @Version 1.0
 */
public class SpeedState extends CourseVideoState{

    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
