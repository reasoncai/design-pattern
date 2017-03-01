package com.cai.factorymethod;

/**
 * Created by reason on 17/2/26.
 */
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = number1 * number2;
        return result;
    }
}
