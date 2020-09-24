package com.miki.composite;

/**
 * @ClassName App
 * @Description TODO 组合模式模拟应用层代码实现
 * @Author miki
 * @Date 2020/2/24 21:42
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {

        //创建linux课程
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        //创建window课程
        CatalogComponent windowsCourse = new Course("Windows课程",22);

        //创建java目录
        CatalogComponent javaCourseCatalog = new CourseCatalog("java课程目录",2);
        CatalogComponent mmallCourse1 = new Course("java电商一期",2200);
        CatalogComponent mmallCourse2 = new Course("java电商二期",2300);
        CatalogComponent javaDesign = new Course("java设计模式",230);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(javaDesign);

        CatalogComponent itcastCourseCatalog = new CourseCatalog("黑马培训课程目录",1);

        //把所有目录加进去
        itcastCourseCatalog.add(linuxCourse);
        itcastCourseCatalog.add(windowsCourse);
        itcastCourseCatalog.add(javaCourseCatalog);

        //打印所有课程
        itcastCourseCatalog.print();
    }
}
