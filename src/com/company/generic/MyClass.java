package com.company.generic;

public class MyClass<T> {

    T obj;

    public MyClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void printType(){
        System.out.println(obj.getClass().getName());
    }
}
