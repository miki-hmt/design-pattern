package com.miki.adapter;

/**
 * @ClassName PowerAdapter
 * @Description TODO 1-3 后期项目功能扩展，需要增加一个输出5V的功能，新建一个适配者
 * @Author miki
 * @Date 2020/2/23 22:24
 * @Version 1.0
 */
public class PowerAdapter implements DC5{

    private AC220 ac220 = new AC220();

    //
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();

        //变压器...电压转换
        int adapterOutput = adapterInput/44;
        System.out.println("使用 PowerAdapter输入AC:"+adapterInput+"V,输出DC:"+adapterOutput+"V");

        return adapterOutput;
    }
}
