package com.cai.observer;

/**
 * 观察者模式
 * Created by reason on 17/3/9.
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        s.addOb(new ConcreteOb(s,"a"));
        s.addOb(new ConcreteOb(s,"b"));
        s.addOb(new ConcreteOb(s,"c"));
        s.setSubjectState("wode");
        s.notifys();
    }
}
