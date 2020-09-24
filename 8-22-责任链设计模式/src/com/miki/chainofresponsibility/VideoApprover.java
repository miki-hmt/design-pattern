package com.miki.chainofresponsibility;

import java.util.Optional;

/**
 * @ClassName VideoApprover
 * @Description TODO 视频批准/审核者实体
 * @Author miki
 * @Date 2020/4/1 11:13
 * @Version 1.0
 */
public class VideoApprover extends Approver{

    @Override
    public void deploy(Course course) {
        Optional.ofNullable(course.getVideo()).map(
                e -> {
                    System.out.println(course.getName()+"含有视频，批准");
                    //核心操作：非空判断
                    if(approver!=null){
                        approver.deploy(course);
                    }
                    return course.getVideo();
                }
        ).orElseGet(() -> print(course.getName()+"不含有视频，不批准"));
    }
}
