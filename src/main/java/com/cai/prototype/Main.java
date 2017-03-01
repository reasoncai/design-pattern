package com.cai.prototype;

/**
 * 原型模式 对象的浅克隆和深克隆
 * Created by reason on 17/3/1.
 */
public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setAddress("guangzhou");
        //浅克隆，只复制基本数据类型,引用类型只是复制一份地址
        Student student1 = new Student();
        student1.setNumber(1);
        student1.setAddress(address);

        Student student2 = (Student)student1.clone();
        student2.getAddress().setAddress("beijing");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1==student2);

        //深克隆 连引用类型都复制一份副本
        Student student3 = new Student();
        student3.setNumber(1);
        student3.setAddress(address);

        Student student4 = (Student)student1.deepClone();
        student4.getAddress().setAddress("shanghai");
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student3==student4);

        //利用对象序列号的深克隆
        Inner inner = new Inner("in");
        Outer outer = new Outer();
        outer.setInner(inner);
        Outer outer2 = outer.deepClone();
        System.out.println(outer);
        System.out.println(outer2);
        System.out.println(outer==outer2);
        outer2.getInner().setName("in2");
        System.out.println("更改后");
        System.out.println(outer);
        System.out.println(outer2);
    }

}
