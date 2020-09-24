package com.warehouse;
import java.util.concurrent.CopyOnWriteArrayList;

/**【6】
 * @ClassName WareHouse
 * @Description TODO 题目需求：电脑仓库进出管理
 * * 仓库会进两种类型电脑：台式机或笔记本，员工来领用电脑时，有可能指定类型，也有可能随意
 * * 仓库出货原则是：老设备优先出。如果你要台式机(pc)，我把最早进来的台式机给你，如果你要笔记本(note)，
 * *我把最早进来的笔记本给你，如果你随意，我就把最早进来的电脑(computer)给你
 * * 要求：
 * * 写一个仓库类，供其它程序调用，由你来设计该类有哪些方法，以及这些方法内部如何实现。
 * * 因为是示例程序，允许程序启动后创建新仓库，程序中止仓库就销毁，所以数据放在内存中，不用数据库。
 * @Author miki
 * @Date 2020/2/20 12:49
 * @Version 1.0
 */
public class WareHouse {
    //线程安全集合
    private CopyOnWriteArrayList<String> databases = new CopyOnWriteArrayList<String>();

    //单例懒汉模式实现线程安全
    private final static WareHouse wareHouse = new WareHouse();

    private WareHouse(){
        //v3
        //阻止饿汉模式下利用反射对单例模式的破坏，在私有构造方法里加上异常抛出，此方法适用于单例对象一开始就已经创建好的饿汉模式
        if(null!=wareHouse){
            throw new RuntimeException("单例构造器禁止反射");
        }
    }

    public static WareHouse getInstance(){
        return wareHouse;
    }

    /**
     *@Author miki
     *@Description //TODO 借出电脑的方法
     *@Date 2020/2/20 13:49
     *@Param [pcType]
     *@Return java.lang.String
     *@Version 1.0
     */
    public String borrow(String pcType){
        String pc;
        int size = this.databases.size();
        if(size>0){
            if(null!=pcType){
                for (int i =0; i <size ; i++) {
                    if(this.databases.get(i).equalsIgnoreCase(pcType)){  //后期改为 computer instance of Pc or Note
                        pc = databases.get(i);
                        databases.remove(i);
                        return pc;
                    }
                }
                return null;
            }

            pc = databases.get(0);
            databases.remove(0);
            return pc;    //如果传参为空，借出任意一个
        }
        return null;
    }

    /**
     *@Author miki
     *@Description //TODO 归还电脑的方法
     *@Date 2020/2/20 13:49
     *@Param [pcType]
     *@Return void
     *@Version 1.0
     */
    public void back(String pcType){
       if(null!=pcType){
           this.databases.add(pcType);
       }
    }

    public String put(String password,String pc){
        if("admin".equalsIgnoreCase(password)){
            this.databases.add(pc);
            return "录入成功";
        }
        return "密码错误，录入失败";
    }


    public static void main(String[] args) {
        WareHouse wareHouse = WareHouse.getInstance();
        wareHouse.databases.add("a");
        wareHouse.databases.add("b");
        wareHouse.databases.add("c");
        wareHouse.databases.add("d");

        System.out.println(wareHouse.databases.get(0));

    }
}
