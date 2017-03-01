package com.cai.simplefactory;

/**
 * Created by reason on 17/2/25.
 */
public abstract class Operation {
    protected double number1=0;
    protected double number2=0;

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public abstract double getResult();
}
