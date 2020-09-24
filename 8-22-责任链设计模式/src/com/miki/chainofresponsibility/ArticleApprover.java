package com.miki.chainofresponsibility;

import java.util.Optional;

/**
 * @ClassName ArticleApprover
 * @Description TODO 文章批准/审核者实体
 * @Author miki
 * @Date 2020/4/1 11:02
 * @Version 1.0
 */
public class ArticleApprover extends Approver{


    @Override
    public void deploy(Course course) {
        Optional.ofNullable(course.getArticle()).map(
           e -> {
               System.out.println(course.getName()+"含有手记，批准");
               //核心操作：非空判断
               if(approver!=null){
                   approver.deploy(course);
               }
               return course.getArticle();
           }
        ).orElseGet(() -> print(course.getName()+"不含有手记，不批准"));
    }
}
