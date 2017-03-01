package com.cai.strategy;

/**
 * Created by reason on 17/2/26.
 */
public class StrategyContext {
    private StrategySuper strategySuper;

    public StrategyContext(int type) {
        switch (type) {
            case 1:
                this.strategySuper = new Strategy1();
                break;
            case 2:
                this.strategySuper = new Strategy2();
                break;
            case 3:
                this.strategySuper = new Strategy3();
                break;
            default:

        }
    }

    public void run(){
        this.strategySuper.execute();
    }
}
