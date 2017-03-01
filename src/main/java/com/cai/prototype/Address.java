package com.cai.prototype;

import java.util.Objects;

/**
 * Created by reason on 17/3/1.
 */
public class Address implements Cloneable{
    private String address;



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Object clone() {
        Object ob = null;
        try {
            ob = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return ob;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
