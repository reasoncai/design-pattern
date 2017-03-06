package com.cai.builder;

/**
 * Created by reason on 17/3/6.
 */
public class ConcreteBuilder2 extends Builder {
    private Product p = new Product();
    @Override
    public void buildPartA() {
        p.add("部件X");
    }

    @Override
    public void buildPartB() {
        p.add("部件Y");
    }

    @Override
    public Product getResult() {
        return p;
    }
}
