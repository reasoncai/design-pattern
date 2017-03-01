package com.cai.prototype;

/**
 * Created by reason on 17/3/1.
 */
public class Student implements Cloneable {
    private int number;
    private Address address;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 浅克隆
     *
     * @return
     */
    @Override
    public Object clone() {
        Object stu = null;
        try {
            stu = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return stu;
    }

    public Object deepClone() {
        Student stu = null;
        try {
            stu = (Student) super.clone();   //浅复制
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        stu.address = (Address) address.clone();   //深度复制
        return stu;
    }


    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", address=" + address +
                '}';
    }
}
