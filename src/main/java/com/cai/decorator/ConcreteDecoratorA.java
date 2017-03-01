package com.cai.decorator;

/**
 * Created by reason on 17/2/26.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addState;

    @Override
    public void operation(){
        super.operation();
        System.out.println("具体装饰对象A的操作");
    }
}
