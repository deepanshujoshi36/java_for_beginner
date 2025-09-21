package com.sachin;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args){
        int[] arr = { 1 , 5 , 2 , 8 , 9 , 3  , 4};
        bubbleSort(arr);
        display(arr);

    }

    //code of bubble sort
    static void bubbleSort(int[] arr ){
        for ( int i = 0 ; i < arr.length ; i++){
            for ( int j = 0 ; j < (arr.length - i - 1) ; j++){
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //code display array
    static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
