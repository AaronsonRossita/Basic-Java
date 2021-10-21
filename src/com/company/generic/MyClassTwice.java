package com.company.generic;

public class MyClassTwice<T, K> {

    T tObj;
    K kObj;

    public MyClassTwice(T tObj, K kObj) {
        this.tObj = tObj;
        this.kObj = kObj;
    }

    public T gettObj() {
        return tObj;
    }

    public void settObj(T tObj) {
        this.tObj = tObj;
    }

    public K getkObj() {
        return kObj;
    }

    public void setkObj(K kObj) {
        this.kObj = kObj;
    }

    public void func (){
        System.out.println(tObj.getClass().getName());
        System.out.println(kObj.getClass().getName());
    }
}
