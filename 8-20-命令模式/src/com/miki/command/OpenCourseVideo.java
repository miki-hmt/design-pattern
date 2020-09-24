package com.miki.command;

/**
 * @ClassName OpenCourseVideo
 * @Description TODO 打开视频的命令实现类
 * @Author miki
 * @Date 2020/3/31 22:42
 * @Version 1.0
 */
public class OpenCourseVideo implements Command{

    private CourseVideo courseVideo;
    //构造方法
    public OpenCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
