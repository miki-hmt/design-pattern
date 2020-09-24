package com.miki.bridge;

/**
 * @ClassName ABCBank
 * @Description TODO 中国农业银行实体类
 * @Author miki
 * @Date 2020/2/26 23:12
 * @Version 1.0
 */
public class ABCBank extends Bank{

    //1.当一个类继承了其它类时，在它的构造函数(constructor)中super()必须被首先调用，如果super()没有被调用，
    //2.则编译器将在构造函数(constructor)的第一行插入对super()的调用。这就是为什么当创建一个子类的对象时会调用父类的构造函数(constructor)的原因。
    //3.这不是创建两个对象，仅创建了一个子对象。父类的构造函数被调用是考虑到其可能有私有的属性需要通过自身的构造函数初始化。
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号..");
        return account;
    }


}
