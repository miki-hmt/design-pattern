package com.miki;

/**
 * 应用层伪代码
 * 功能：定义一个长方形对象，让正方形继承该父类
 */
public class Test {

    public static void resetSize(Rectangle rectangle){
        while(rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+" length:"+rectangle.getLength());
        }
    }

    public static void main(String[] args) {
        //v1
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
        resetSize(rectangle);

        //v2
        //2020.02.09  miki 错误示例，运行子类会导致程序死循环
        System.out.println("版本2*******************");
        Square square = new Square();
        square.setLength(10);
        resetSize(square);
    }
}
