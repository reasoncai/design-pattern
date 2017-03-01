package com.cai.factorymethod;

/**
 * Created by reason on 17/2/26.
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if(number2 == 0){
            System.out.println("除数不能为0");
        }else{
        result = number1 / number2;}
        return result;
    }
}
