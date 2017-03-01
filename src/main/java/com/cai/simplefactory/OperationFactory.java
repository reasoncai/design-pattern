package com.cai.simplefactory;

/**
 * Created by reason on 17/2/26.
 */
public class OperationFactory {
    public static Operation createOperate(String operate){
        Operation oper = null;
        if("+".equals(operate)){
            oper =  new OperationAdd();
        }else if("-".equals(operate)){
            oper =  new OperationSub();
        }else if("/".equals(operate)){
            oper = new OperationDiv();
        }else if("*".equals(operate)){
            oper = new OperationMul();
        }
        return oper;
    }
}
