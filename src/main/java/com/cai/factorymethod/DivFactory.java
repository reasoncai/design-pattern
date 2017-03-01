package com.cai.factorymethod;

/**
 * Created by reason on 17/2/27.
 */
public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
