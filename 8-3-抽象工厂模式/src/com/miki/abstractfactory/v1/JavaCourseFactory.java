package com.miki.abstractfactory.v1;

/**
 * JavaCourseFactory为产品族，包含视频和手记
 */
public class JavaCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
