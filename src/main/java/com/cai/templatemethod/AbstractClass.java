package com.cai.templatemethod;

/**
 * Created by reason on 17/3/1.
 */
public abstract class AbstractClass {
    //一些抽象行为，放到子类去实现
    public abstract void method1();
    public abstract void method2();

    /**
     * 模板方法，给出了逻辑的骨架，而逻辑的组成是一些相应的抽象操作，留到子类中实现
     */
    public void templateMethod(){
        System.out.println("模板方法开始");
        method1();
        method2();
        System.out.println("模板方法结束");
    }
}
