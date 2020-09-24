package com.miki.builder.v2;

/**
 * 课程对象 v2版本
 */
public class Course {

    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;

    //课程问答
    private String courseQA;

    //v2
    //构造器，通过courseBuilder建造者创建course对象
    public Course(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }


    //v2 演进版，创建静态内部类（针对复杂应用，一个实体对应一个内部类），利用链式调用来创建builder
    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;

        //课程问答
        private String courseQA;

        //v2
        //利用链式调用来处理参数赋值，解决构造参数多，命名乱的问题
        public CourseBuilder buildCourseName(String courseName){
            this.courseName = courseName;
            return this;
        }public CourseBuilder buildcoursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }public CourseBuilder buildcourseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }public CourseBuilder buildcourseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }public CourseBuilder buildcourseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }


        public Course build(){
            return new Course(this);
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
