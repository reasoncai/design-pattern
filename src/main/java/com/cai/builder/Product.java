package com.cai.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reason on 17/3/6.
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("产品创建----");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
