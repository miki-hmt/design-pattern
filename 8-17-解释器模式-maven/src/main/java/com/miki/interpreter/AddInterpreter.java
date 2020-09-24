package com.miki.interpreter;

/**
 * @ClassName AddInterpreter
 * @Description TODO 加法的解释器类
 * @Author miki
 * @Date 2020/3/11 23:00
 * @Version 1.0
 */
public class AddInterpreter implements Interpreter{

    private Interpreter firstExpression,secondExpression;

    //添加有参构造器
    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return firstExpression.interpreter() + secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "+";
    }
}
