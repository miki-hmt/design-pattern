package com.miki.interpreter;

/**
 * @ClassName OperatorUtil
 * @Description TODO 操作符工具类
 * @Author miki
 * @Date 2020/3/11 23:28
 * @Version 1.0
 */
public class OperatorUtil {

    //判断是否是操作符
    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("*"));
    }

    //得到表达式解释器
    public static Interpreter getExpressionObject(Interpreter firstExpression,Interpreter secondExpression,String symbol){
        if(symbol.equals("+")){
            return new AddInterpreter(firstExpression,secondExpression);
        }else if(symbol.equals("*")){
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}
