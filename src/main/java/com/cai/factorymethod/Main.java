package com.cai.factorymethod;

/**
 * 工厂方法模式
 * Created by reason on 17/2/26.
 */
public class Main {
    public static void main(String[] args) {
        Operation operate = null;
        IFactory addFactory = new AddFactory();
        operate = addFactory.createOperation();
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

        IFactory subFactory = new SubFactory();
        operate = subFactory.createOperation();
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

        IFactory mulFactory = new MulFactory();
        operate = mulFactory.createOperation();
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

        IFactory divFactory = new DivFactory();
        operate = divFactory.createOperation();
        operate.number1 = 18;
        operate.number2 = 6;
        System.out.println(operate.getResult());

    }
}
