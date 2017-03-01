package com.cai.simplefactory;

/**
 * Created by reason on 17/2/25.
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        result = number1 + number2;
        return result;
    }
}
