package com.miki.factory.v1;

public abstract class VideoFactory {

    //v4
    //工厂模式，将实例化操作交给子类去实现
    public abstract Video getVideo();



//*****************简单工厂模式demo   2020.02.10 miki******************
    //v2 通过传参字符类型生成对应得video
//    public Video getVideo(String type){
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }
//        return null;
//    }

    //v3 通过new Instance实例化生成java视频
    //使用反射实现简单工厂模式的升级
//    public Video getVideo(Class c){
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        return video;
//    }
}
