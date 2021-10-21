package com.company.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericRunner {

    public static void main(String[] args) {
//
//        ArrayList arr = new ArrayList();
//        arr.add(2);
//        arr.add("String");
//        arr.add(true);
//
//        System.out.println(arr.get(0).getClass().getName());
//        System.out.println(arr.get(1).getClass().getName());
//        System.out.println(arr.get(2).getClass().getName());
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//
//        MyClass obj1 = new MyClass(4);
//        MyClass<Integer> obj2 = new MyClass<>(4);
//
//        obj1.printType();
//        obj1.obj = "String";
//        obj1.printType();
//
//        obj2.printType();

        HashMap<Integer, String> hashy = new HashMap();
        hashy.put(1,"one");

//        MyClassTwice obj = new MyClassTwice(1,2);
//        obj.func();
//        obj.setkObj("k");
//        System.out.println("-----");
//        obj.func();
//
//        MyClassTwice<Integer, String> obj2 = new MyClassTwice<>(1, "one");
//        obj2.func();

        NumericFuncs<Integer> num1 = new NumericFuncs<>(4);
        NumericFuncs<Double> num2 = new NumericFuncs<>(4.2);

        System.out.println(num1.absValue(num2));







    }

}
