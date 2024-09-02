package javaCustomClasses;

import java.util.ArrayList;

public class ArraListCustom extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (contains(o)){
            return true;
        }
        return super.add(o);
    }
   // ArraListCustom arraListCustom=new ArraListCustom();
  //  ArrayList arrayList=new ArrayList();



}
