package com.miki.bridge;

/**
 * @ClassName App
 * @Description TODO 模拟打开银行卡账户的应用层代码操作
 * @Author miki
 * @Date 2020/2/26 23:54
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {

        //打开中国农业银行的定期账户
        ABCBank abcBank = new ABCBank(new DepositAcount());
        Account account = abcBank.openAccount();
        abcBank.account.showAcountType();   //abcBank.account.showAcountType()

        //打开中国农业银行的活期账户
        ABCBank abcBank2 = new ABCBank(new SavingAccount());
        Account account1 = abcBank2.openAccount();
        account1.showAcountType();

        //打开中国工商银行的活期账户
        ICBCBank icbcBank = new ICBCBank(new DepositAcount());
        Account account2 = icbcBank.openAccount();
        account2.openAccount();
    }
}
