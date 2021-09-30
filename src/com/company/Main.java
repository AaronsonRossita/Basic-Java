package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

enum Levels{
    LOW, MEDIUM, HIGH
}

public class Main {

//    public final static String[] levels1 = {"Low","Medium","High"};
//    public final static String low = "Low";
//    public final static String med = "Medium";
//    public final static String hig = "High";


//    public static String[] levels2 = new String[3];

    public static void main(String[] args) throws Exception {

//
//        int a = 5;
//        int b = 7;
//        int c = 8;
//
//        byte a1 = 127;
//        short a2 = 32767;
//        int n = 345;
//        Integer n1 = null;
//        long a3 = 45435l;
//        float a4 = 58794f;
//        double a5 = 2.5;
//
//        Integer b2 = 45;  //Autoboxing
//        int a = b2;
//
//        int a = (int) 2.9; //Casting
//        System.out.println(a);
//
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
//
//        Scanner scanner = new Scanner(System.in);
//        Food food = new Food("fruit","Company");
//        System.out.println(food);
//        Fruit fruit = new Fruit("fruit","blah","banana");
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
//
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//
//        for ( int element : arr1){
//            System.out.println(element);
//        }
//
//
//        System.out.println(red);
//        System.out.println(blue);
//
//        Calculator calc = new Calculator();
//        calc.sum(1,3);
//        Vegetable vegie = new Vegetable("veggie","blah",15);
//        System.out.println(vegie);
//
//
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
//
//
//        String s1 = "aaa";
//        String s2 = "aaa";
//        System.out.println(s1.compareTo(s2) == -1);
//
//        List<Integer> numbers = new ArrayList<>();
//        List<String> words = new ArrayList<>();
//
//        numbers.add(0,2);
//        numbers.add(3);
//        numbers.add(4);
//        System.out.println(numbers);
//        System.out.println(numbers.get(2));
//
//        House red = new House(4);
//
//        House blue = red;
//        not copying the object, just creating a new reference
//
//
//        House blue = new House(red.getWindows(),red.getRoofType(),red.isLawn());
//        actually copying the object but a longer way
//
//
//        House blue = new House(red);
//        System.out.println(red);
//        System.out.println(blue);
//
//        red.setRoofType("flat");
//
//        System.out.println(red);
//        System.out.println(blue);

// todo: learn about design patterns

//        int[][] arr1 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        int[][] arr2 = {
//                {1, 2},
//                {4},
//                {7, 13, 15},
//                {10}
//        };

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("{");
//            for (int j = 0; j < arr[i].length; j++) {
//                if (j != arr[i].length-1){
//                    System.out.print(arr[i][j] + ",");
//                }else{
//                    System.out.print(arr[i][j]);
//                }
//            }
//            System.out.println("}");
//        }

//        for (int[] temp : arr1) {
//            System.out.print("{");
//            for (int number : temp){
//                System.out.print(number + ",");
//            }
//            System.out.println("}");
//        }

//        System.out.println(levels1[0]);
//        levels1[0] = "notLow";
//        System.out.println(levels1[0]);

//        levels2 = levels1;
//        System.out.println(levels1);
//        System.out.println(levels2);
//
//        for (int i = 0; i < levels1.length; i++) {
//            levels1[i] = levels2[i];
//        }
//
//        for (String level : levels2) {
//            System.out.println(level + ",");
//        }

//        levels2[0] = low;
//        levels2[1] = med;
//        levels2[2] = hig;
//        levels2[0] = med;
//
//        for (String level : levels2){
//            System.out.print(level + ",");
//        }
//
//        Levels l = Levels.LOW;
//
//        switch (l){
//            case LOW:
//                System.out.println("you chose Low");
//                break;
//            case MEDIUM:
//                System.out.println("you chose Medium");
//                break;
//            case HIGH:
//                System.out.println("you chose High");
//                break;
//            default:
//                System.out.println("you chose nothing");
//        }

//        String name1 = "Rossita";
//        char[] arr = {'a','b','c'};
//        String name2 = new String(arr);
//        System.out.println(name1);
//
//        name1 = "new name";
//        System.out.println(name1);
//
//        String one = "Ane";
//        String two = "ane";
//        System.out.println(one.compareTo(two));
//        System.out.println(one.compareTo(two.toLowerCase()));
//
//        System.out.println(one.equals(two));
//
//        String name3 = name1.concat("one");
//        System.out.println(name3);
//        System.out.println(name1 + "one");
//
//        String name4 = name1.replace("sit","");
//        System.out.println(name4);
//        System.out.println(name1.replace("sit",""));
//
//        StringBuffer buffer = new StringBuffer("my buffer");
//        System.out.println(buffer);
//        buffer.append("ina");
//        System.out.println(buffer);

        int[] arr = {1,2,3};

//        try{
//            System.out.println(arr[2]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("the array ended");
//        }catch (ArithmeticException e){
//            System.out.println("math");
//        }catch (Exception e){
//            System.out.println("default exception");
//        }

//        System.out.println(arr[4]);

//        try{
//            System.out.println(arr[2]);
//            try{
//                System.out.println(arr[2]);
//            }catch (Exception e){
//                System.out.println("i was caught in the nessted catch");
//            }
//        }catch (Exception e){
//            System.out.println(e.fillInStackTrace());
//        }finally {
//            System.out.println("finally");
//        }
        recursion(5);

    }

    public static void example1 (int[] arr){
        try{
            System.out.println(arr[4]);
        }catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void example2 (int[] arr){
        try{
            System.out.println(arr[4]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }catch (ArithmeticException e){
            System.out.println("math");
        }catch(Exception e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public static void example3 () throws Exception{
        if (true){
            throw new Exception("true");
        }
        System.out.println("something");

    }

    public static void example4 () throws Exception {
        example3();
    }

    public static void example5 (){
        try{
            example3();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void example6(int[] arr){
        try{
            System.out.println(arr[5]);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("I'm happening either way");
        }
    }

    public static void example7(int x) throws MyException{
        if(x > 5){
            throw new MyException(x + " is larger than 5");
        }else{
            System.out.println(x + " is smaller than 5");
        }
    }

    public static void recursion (int x){
        System.out.println("now x is " + x);
        if (x == 0){
            System.out.println("done");
        }else{
            System.out.println("hi");
            recursion(--x);
        }
    }

}


