package com.cai.prototype;

import java.io.Serializable;

/**
 * Created by reason on 17/3/1.
 */
public class Inner implements Serializable{

    private static final long serialVersionUID = -856318778585721594L;

    private String name;

    public Inner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inner{" +
                "name='" + name + '\'' +
                '}';
    }
}
