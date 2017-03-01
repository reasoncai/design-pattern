package com.cai.prototype;

import java.io.*;

/**
 * Created by reason on 17/3/1.
 */
public class Outer implements Serializable {

    private static final long serialVersionUID = -485059801402475021L;

    private Inner inner;

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    /**
     * 深度复制方法,需要对象及对象所有的对象属性都实现序列化
     *
     * @return
     */
    public Outer deepClone() {
        Outer outer = null;
        try {
            // 将该对象序列化成流,因为写在流里的是对象的一个拷贝，而原对象仍然存在于JVM里面。所以利用这个特性可以实现对象的深拷贝
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            //将流序列化为对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            outer = (Outer) ois.readObject();
        } catch (Exception e) {

        }
        return outer;
    }

    @Override
    public String toString() {
        return "Outer{" +
                "inner=" + inner +
                '}';
    }
}
