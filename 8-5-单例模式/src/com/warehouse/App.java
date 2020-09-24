package com.warehouse;

/**【6】
 * @ClassName App
 * @Description TODO 模拟应用层代码
 * @Author miki
 * @Date 2020/2/20 13:53
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {

        WareHouse wareHouse = WareHouse.getInstance();
        String put = wareHouse.put("admin", "pc");
        wareHouse.put("admin", "note");
        System.out.println(put);

        //模拟多线程同时借一台电脑
        /*Thread tt = new Thread(new TestThread());
        Thread tt1 = new Thread(new TestThread());
        tt.start();
        tt1.start();*/

        //模拟多线程同时借两台不同的电脑
        Thread tt = new Thread(new TestThread(null));
        Thread tt1 = new Thread(new TestThread("pc"));
        tt.start();
        tt1.start();
    }
}
