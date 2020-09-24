package com.miki.interpreter;

import java.util.Stack;

/**
 * @ClassName ExpressionParser
 * @Description TODO 表达式翻译器
 * @Author miki
 * @Date 2020/3/11 23:02
 * @Version 1.0
 */
public class ExpressionParser {

    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray){
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberInterpreter = new NumberInterpreter(symbol);
                stack.push(numberInterpreter);

                System.out.println(String.format("入栈: %d",numberInterpreter.interpreter()));
            }else{
                //是运算符，可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();

                System.out.println(String.format("出栈: %d 和 %d",firstExpression.interpreter(),secondExpression.interpreter()));

                Interpreter interpreter = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符: %s",symbol));
                int result = interpreter.interpreter();
                NumberInterpreter resultInterpreter = new NumberInterpreter(result);
                stack.push(resultInterpreter);
                System.out.println(String.format("阶段结果入栈: %d",resultInterpreter.interpreter()));
            }
        }
        int result = stack.pop().interpreter();
        return result;
    }
}
