package com.sachin;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 6, 90, 5, 9, 8};
        SelectionSort(arr);
        display(arr);
    }
    //selection sort code
    static void SelectionSort(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            int min = i;
            for (int j = i + 1 ;  j < arr.length ; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp ;
        }
    }
    //code display array
    static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
