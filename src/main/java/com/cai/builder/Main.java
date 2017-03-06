package com.cai.builder;

/**
 * 建造者模式
 * Created by reason on 17/3/6.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();

        director.construct(concreteBuilder1);
        Product result = concreteBuilder1.getResult();
        result.show();

        director.construct(concreteBuilder2);
        Product result1 = concreteBuilder2.getResult();
        result1.show();

    }
}
