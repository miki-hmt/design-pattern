package com.miki.state;

/**
 * @ClassName CourseVideoState
 * @Description TODO 视频课程状态实体
 * @Author miki
 * @Date 2020/4/1 15:43
 * @Version 1.0
 */
public abstract class CourseVideoState {

    protected CourseVideoContext courseVideoContext;

    //setter注入
    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    //播放
    public abstract void play();
    //加速
    public abstract void speed();
    //暂停
    public abstract void pause();
    //停止
    public abstract void stop();

}
