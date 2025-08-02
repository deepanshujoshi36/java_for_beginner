package com.sachin;

import java.util.Arrays;

public class Passing_In_Function {
    public static void main(String[] args){
        int[] num = { 1,4,6,7,8};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));


    }
    static void change(int[] arr){
        arr[3] = 56 ;
    }

}
