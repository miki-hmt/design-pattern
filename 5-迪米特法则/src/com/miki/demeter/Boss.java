package com.miki.demeter;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    //v1
    //普通版本
    public void commandCheckNumber(TeamLeader teamLeader){
        List<Course> courses = new ArrayList<>();
        for(int i = 0;i<10;i++){
            courses.add(new Course());
        }
        teamLeader.checkNumberOfCourses(courses);
    }


    //v2
    //迪米特法则  尽量减少boss类对外部类的依赖，不引入课程类
    public void commandCheckNumberV2(TeamLeader teamLeader){

        teamLeader.checkNumberOfCourses();
    }
}
