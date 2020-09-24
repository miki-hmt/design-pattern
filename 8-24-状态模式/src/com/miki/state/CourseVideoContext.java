package com.miki.state;

/**
 * @ClassName CourseVideoContext
 * @Description TODO 课程视频上下文
 * @Author miki
 * @Date 2020/4/1 15:48
 * @Version 1.0
 */
public class CourseVideoContext {

    private CourseVideoState courseVideoState;
    //享元设计模式
    public final static PlayState PLAY_STATE = new PlayState();
    public final static SpeedState SPEED_STATE = new SpeedState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }
    //setter方法注入
    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        //设置上下文为自己，通知到各个类
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play(){
        this.courseVideoState.play();
    }

    public void stop(){
        this.courseVideoState.stop();
    }

    public void speed(){
        this.courseVideoState.speed();
    }

    public void pause(){
        this.courseVideoState.pause();
    }

}
