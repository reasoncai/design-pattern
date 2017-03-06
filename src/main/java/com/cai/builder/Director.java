package com.cai.builder;

/**
 * 用来指挥构造过程
 * Created by reason on 17/3/6.
 */
public class Director {
    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
