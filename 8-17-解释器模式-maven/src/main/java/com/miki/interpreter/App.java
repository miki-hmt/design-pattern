package com.miki.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName App
 * @Description TODO 模拟应用层代码实现  前任(公司)吐槽
 * @Author miki
 * @Date 2020/3/11 23:42
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {

        //示例1，本地demo
        String expression = "6 100 11 + *";
        ExpressionParser parser = new ExpressionParser();
        int result = parser.parse(expression);

        System.out.println("解释器计算结果："+result);


        //示例2 spring中的表达式
        org.springframework.expression.ExpressionParser  expressionParser= new SpelExpressionParser();
        Expression parseExpression = expressionParser.parseExpression("100 * 2 + 400 * 1 +66");
        int value = (Integer)parseExpression.getValue();
        System.out.println(value);
    }
}
