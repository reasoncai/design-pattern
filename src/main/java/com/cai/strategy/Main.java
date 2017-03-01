package com.cai.strategy;

/**
 * 策略模式
 * Created by reason on 17/2/26.
 */
public class Main {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext(1);
        strategyContext.run();
    }
}
