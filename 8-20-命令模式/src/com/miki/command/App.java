package com.miki.command;

/**
 * @ClassName App
 * @Description TODO 应用层代码模拟
 * @Author miki
 * @Date 2020/3/31 22:51
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲");
        OpenCourseVideo openCommand = new OpenCourseVideo(courseVideo);
        CloseCourseVideo closeCommand = new CloseCourseVideo(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        //一会又接到一个命令
        staff.addCommand(closeCommand);

        staff.executeCommands();
    }
}
