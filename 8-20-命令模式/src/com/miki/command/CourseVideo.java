package com.miki.command;

/**
 * @ClassName CourseVideo
 * @Description TODO 课程视频
 * @Author miki
 * @Date 2020/3/31 22:39
 * @Version 1.0
 */
public class CourseVideo {

    private String name;
    //构造方法
    public CourseVideo(String name) {
        this.name = name;
    }

    //打开视频
    public void open(){
        System.out.println(this.name+"课程视频开放");
    }

    //关闭视频
    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }


}
