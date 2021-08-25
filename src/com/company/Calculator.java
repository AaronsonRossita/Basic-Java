package com.company;

public class Calculator {

    public int sum (int a, int b){
        return a + b;
    }

    public int sum (int[] arr){
        int result = 0;
        for (int n : arr){
            result += n;
        }
        return result;
    }

    public static int sub (int a, int b){
        return a - b;
    }

    public static int sub (int[] arr){
        int result = 0;
        for (int n : arr){
            result -= n;
        }
        return result;
    }

    public static int mult (int a, int b){
        return a * b;
    }

    public static int mult (int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result *= arr[i];
        }
        return result;
    }

    public static int div (int a, int b){
        return a / b;
    }

    public static int div (int[] arr){
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result /= arr[i];
        }
        return result;
    }

}
