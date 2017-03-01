package com.cai.proxy;

/**
 * Created by reason on 17/2/27.
 */
public class RealSubject extends Subject {
    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
