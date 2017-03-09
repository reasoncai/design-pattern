package com.cai.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reason on 17/3/9.
 */
public class Subject {
    private List<Ob> obList = new ArrayList<>();
    public void addOb(Ob ob){
        this.obList.add(ob);
    }
    public void removeOb(Ob ob){
        this.obList.remove(ob);
    }
    public void notifys(){
        for (Ob ob:obList
             ) {
            ob.update();
        }
    }
}
