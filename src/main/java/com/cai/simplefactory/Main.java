package com.cai.simplefactory;

/**
 * 简单工厂模式
 * Created by reason on 17/2/26.
 */
public class Main {
    public static void main(String[] args) {
        Operation operate = null;
        operate = OperationFactory.createOperate("+");
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

        operate = OperationFactory.createOperate("-");
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

        operate = OperationFactory.createOperate("*");
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

        operate = OperationFactory.createOperate("/");
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

    }
}
