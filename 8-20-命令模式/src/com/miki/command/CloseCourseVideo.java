package com.miki.command;

/**
 * @ClassName CloseCourseVideo
 * @Description TODO 关闭视频的命令类
 * @Author miki
 * @Date 2020/3/31 22:42
 * @Version 1.0
 */
public class CloseCourseVideo implements Command{

    private CourseVideo courseVideo;

    public CloseCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
