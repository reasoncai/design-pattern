package com.cai.decorator;

/**
 * Created by reason on 17/2/26.
 */
public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation(){
        super.operation();
        System.out.println("具体装饰对象b的操作");
    }
}
