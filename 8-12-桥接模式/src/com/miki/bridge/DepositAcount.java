package com.miki.bridge;

/**
 * @ClassName DepositAcount
 * @Description TODO 创建一个定期账号的实体类，实现接口
 * @Author miki
 * @Date 2020/2/26 23:01
 * @Version 1.0
 */
public class DepositAcount  implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new SavingAccount();
    }

    @Override
    public String showAcountType() {
        System.out.println("这是一个定期账号");
        return "deposit";
    }
}
