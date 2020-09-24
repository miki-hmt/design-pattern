package com.miki.abstractfactory.v1;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Article article = factory.getArticle();
        Video video = factory.getVideo();

        article.producce();
        video.produce();
    }
}
