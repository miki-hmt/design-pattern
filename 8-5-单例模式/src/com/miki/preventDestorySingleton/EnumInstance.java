package com.miki.preventDestorySingleton;

/**【4】
 *@Author miki
 *@Description //TODO 枚举类，实现单例，防止反射和多线程破坏单例
 *@Date 2020/2/16 16:14
 *@Param 
 *@Return 
 *@Version 1.0
 */
public enum EnumInstance {
    //v1
    //简单的枚举对象
    //INSTANCE;

    //v2
    //复杂枚举对象，实例里声明方法
    INSTANCE{
        protected void printTest(){
            System.out.println("miki写日志...");
        }
    };
    protected abstract void printTest();    //必须要声明一个同名的抽象方法，否则外部无法调用printTest()方法。


    private Object data;

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
