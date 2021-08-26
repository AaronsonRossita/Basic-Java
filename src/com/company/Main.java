package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//
//        int a = 5;
//        int b = 7;
//        int c = 8;
//
//        byte a1 = 127;
//        short a2 = 32767;
//        long a3 = 45435l;
//        float a4 = 58794f;
//        double a5 = 2.5;
//
//        char r = 'r';
//
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
        Food food = new Food("fruit","Company");
//        System.out.println(food);
        Fruit fruit = new Fruit("fruit","blah","banana");
//        System.out.println(fruit);
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
//
//        int[] arr1 = {1,2,3,4};
//        int[] arr2 = {1,2,3,4};
//
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
//        House red = new House();
//        House green = red;
//        House blue = new House(red);
//        House purple = new House(blue.getWindows(),blue.getRoofType(),blue.isLawn());
//        red.setLawn(true);
//
//        System.out.println(red);
//        System.out.println(blue);
//
//        Calculator calc = new Calculator();
//        calc.sum(1,3);
//        Vegetable vegie = new Vegetable("veggie","blah",15);
//        System.out.println(vegie);

        String menu =
                "Please select one of the following options: \n"
                        + " 1. Create an object of food \n"
                        + " 2. Create an object of fruit \n"
                        + " 3. Create an object of vegetable \n";

//        System.out.println(menu);
//
//        int n = scanner.nextInt();
//
//        switch (n){
//            case 1:
//                System.out.println("an object of food was created");
//                break;
//            case 2:
//                System.out.println("an object of fruit was created");
//                break;
//            case 3:
//                System.out.println("an object of vegetable was created");
//            default:
//                System.out.println("please start over and give the right number");
//        }



    }
}
