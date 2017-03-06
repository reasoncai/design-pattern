package com.cai.facade;

/**
 * 门面模式
 * Created by reason on 17/3/5.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
