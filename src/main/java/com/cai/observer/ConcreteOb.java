package com.cai.observer;

/**
 * Created by reason on 17/3/9.
 */
public class ConcreteOb extends Ob {
    private String name;
    private String obState;
    private ConcreteSubject subject;

    public ConcreteOb(ConcreteSubject subject,String name){
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        obState = subject.getSubjectState();
        System.out.printf("观察者 %s 的新状态是 %s \n",name,obState);
    }
}
