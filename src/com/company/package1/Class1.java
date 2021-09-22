package com.company.package1;

import java.util.Iterator;

public class Class1 {



    int a = 1;      // default access modifier
    public int b = 2;
    private int c = 4;
    protected int d = 3;

    Iterator i = new Iterator() {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    };

    public static void one (){
        System.out.println("method1");
    }

    public void two (){
        System.out.println("method2");
    }

    private  void three (){
        System.out.println("method3");
    }

    protected void four (){
        System.out.println("method4");
    }

}
