package com.miki.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourses(List<Course> courses){
        System.out.println("在线课程的数量："+courses.size());

    }


    //v2
    public void checkNumberOfCourses(){
        List<Course> courses = new ArrayList<>();
        for(int i = 0;i<10;i++){
            courses.add(new Course());
        }
        System.out.println("在线课程的数量："+courses.size());

    }
}
