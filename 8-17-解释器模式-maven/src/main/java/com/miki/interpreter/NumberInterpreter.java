package com.miki.interpreter;

/**
 * @ClassName NumberInterpreter
 * @Description TODO 字符串格式化解释器
 * @Author miki
 * @Date 2020/3/11 23:11
 * @Version 1.0
 */
public class NumberInterpreter implements Interpreter{

    private int num;
    //构造方法重写
    public NumberInterpreter(int number) {
        this.num = number;
    }

    //构造方法重写
    public NumberInterpreter(String number){
        this.num = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return this.num;
    }
}
