package com.miki.interpreter;

/**
 * @ClassName MultiInterpreter
 * @Description TODO 乘法解释器类
 * @Author miki
 * @Date 2020/3/11 23:09
 * @Version 1.0
 */
public class MultiInterpreter implements Interpreter{

    private Interpreter firstExpression,secondExpression;

    //添加有参构造器
    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    //解释器方法，
    @Override
    public int interpreter() {
        return firstExpression.interpreter() * secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}
