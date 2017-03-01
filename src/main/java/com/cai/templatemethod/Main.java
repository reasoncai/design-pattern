package com.cai.templatemethod;

/**
 * 模板方法模式
 * 通过把不变的行为搬到父类，去除子类中的重复代码，从而达到代码复用
 * Created by reason on 17/3/1.
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass abc;
        abc = new ConcreteClassA();
        abc.templateMethod();
        abc = new ConcreteClassB();
        abc.templateMethod();

    }
}
