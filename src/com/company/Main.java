package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean trueOrFalse = false;

        int a = 5;
        int b = 7;
        int c = 8;

        byte a1 = 127;
        short a2 = 32767;
        long a3 = 45435l;
        float a4 = 58794f;
        double a5 = 2.5;

        char r = 'r';

//        if (a <= b){
//            System.out.println("a is bigger");
//        }else{
//            System.out.println("b is bigger");
//        }
//
//        if (a < b && b < c) { // and
//            System.out.println("first");
//        }
//
//        if (a < b || b < c) { // or
//            System.out.println("first");
//        }
//
//        if (a == b) { // equal
//            System.out.println("first");
//        }
//
//        if (a != c) { // not equal
//            System.out.println("first");
//        }
//
//        if(!trueOrFalse){
//            System.out.println("sike");
//        }

        Scanner scanner = new Scanner(System.in);
//
//        String s1 = "Hello";
//        String s2 = "Hello";
//
//        if(s1 == s2){
//            System.out.println("equal");
//        }
//
//        System.out.println("pls enter the first word");
//        s1 = scanner.next();
//        System.out.println("pls enter the second word");
//        s2 = scanner.next();
//
//        if(s1.equals(s2)){
//            System.out.println("equal");
//        }else{
//            System.out.println("nah");
//        }

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};

//        while(a < b){
//            System.out.println("a is smaller");
//            a++; // a = a + 1, a += 1.
//        }
//
//        do{
//            System.out.println("a is smaller");
//            a++;
//        }while(a < b);

//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//
//        for ( int element : arr1){
//            System.out.println(element);
//        }
        House red = new House();
        House green = red;
        House blue = new House(red);
        House purple = new House(blue.getWindows(),blue.getRoofType(),blue.isLawn());
        red.setLawn(true);

        System.out.println(red);
        System.out.println(blue);

        Calculator calc = new Calculator();
        calc.sum(1,3);
    }
}
