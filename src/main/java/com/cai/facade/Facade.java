package com.cai.facade;

/**
 * 门面类
 * Created by reason on 17/3/5.
 */
public class Facade {
    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;
    SubSystemFour four;

    public Facade(){
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("方法组A-----");
        one.method1();
        two.method2();
        four.method4();
    }

    public void methodB(){
        System.out.println("方法组B-----");
        three.method3();
        two.method2();
    }
}
