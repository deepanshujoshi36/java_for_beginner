package com.sachin;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args){
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 };
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start = 0 , end = arr.length -1 ;
        while(start < end ){      //this loop will run until reverse of the array
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start ++ ;
            end --;
        }
    }
}
