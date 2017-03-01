package com.cai.proxy;

/**
 * Created by reason on 17/2/27.
 */
public class Proxy extends Subject {
    private RealSubject realSubject;
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        System.out.println("代理执行：");
        realSubject.request();
    }
}
