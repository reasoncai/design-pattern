package com.cai.decorator;

/**
 * Created by reason on 17/2/26.
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
