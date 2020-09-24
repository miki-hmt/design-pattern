package com.miki.templatemethod;

/**
 * @ClassName ACourse
 * @Description TODO 课程抽象类
 * @Author miki
 * @Date 2020/2/29 21:14
 * @Version 1.0
 */
public abstract class ACourse {

    //！！必须声明为final，是不希望子类去覆盖这个方法，防止破坏里面录制课程的流程顺序   2020.02.29 miki
    protected  final void makeCourse(){
        this.nakeVideo();
        this.makePPT();
        if(needWriteArticle()){     //钩子方法
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void nakeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.out.println("编写手记");
    }

    //钩子方法，是否需要编写手记
    protected boolean needWriteArticle(){

        return false;
    }

    //打包课程是动态不同的，可以交给子类去实现
    abstract void packageCourse();


}
