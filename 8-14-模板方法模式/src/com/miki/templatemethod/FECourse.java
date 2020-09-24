package com.miki.templatemethod;

/**
 * @ClassName FECourse
 * @Description TODO    前端课程实体类，可变行为是：需要提供前端课程源代码，素材，图片，多媒体素材
 * @Author miki
 * @Date 2020/2/29 21:22
 * @Version 1.0
 */
public class FECourse extends ACourse{

    //v1 覆盖钩子方法，判断前端课程是否都要写手记
    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
    //无参构造函数
    public FECourse() {
    }

    //v2 增加一个boolean类型判断，赋权给应用层去判断是否需要在某些课程上加手记
    private Boolean needWriteArticleFlag = false;
    //有参构造，注入钩子参数
    public FECourse(Boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片，多媒体素材");
    }
}
