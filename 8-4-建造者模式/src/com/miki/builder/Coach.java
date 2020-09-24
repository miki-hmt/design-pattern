package com.miki.builder;

/**2020.02.12 miki
 * 课程教练对象
 * 举例：讲师在慕课网教课，慕课网会专门派出一个课程教练或经理与其对接，慕课策划会制定教学计划，然后传达给课程教练，教练与讲师对接，共同制作该课程的视频
 */
public class Coach {

    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder){
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,String coursePPT,String courseVideo,String courseArticle,String courseQA){
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCoursePPT(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseQA(courseQA);
        this.courseBuilder.buildCourseName(courseName);

        return this.courseBuilder.makeCourse();
    }
}
