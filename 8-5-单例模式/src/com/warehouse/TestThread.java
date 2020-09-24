package com.warehouse;

/**【6】
 * @ClassName TestThread
 * @Description TODO
 * @Author miki
 * @Date 2020/2/20 13:51
 * @Version 1.0
 */
public class TestThread implements Runnable{

    private String pcType;

    public TestThread(String pcType){
        this.pcType = pcType;
    }


    @Override
    public void run() {
        WareHouse wareHouse = WareHouse.getInstance();
        String pc = wareHouse.borrow(pcType);
        if(null!=pc){
            System.out.println(Thread.currentThread().getName()+": 借入"+pcType+"成功！！");
        }else{
            System.out.println(Thread.currentThread().getName()+": 借入"+pcType+"失败！！");
        }

    }
}
