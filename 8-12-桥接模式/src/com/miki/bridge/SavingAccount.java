package com.miki.bridge;

/**
 * @ClassName SavingAccount
 * @Description TODO    活期账户实体类
 * @Author miki
 * @Date 2020/2/26 23:02
 * @Version 1.0
 */
public class SavingAccount implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public String showAcountType() {
        System.out.println("这是一个活期账号");
        return "save";
    }
}
