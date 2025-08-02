package com.sachin;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5 };
        //print the value of the index return by function max(arr)
        if(max(arr) == -1){
            System.out.println("empty array");
        }
        else{
            System.out.println(arr[max(arr)]);
        }
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1 ;
        }
        else {
            int largest = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[largest] < arr[i]) {
                    largest = i;
                }
            }
            return largest;   //returns the index of largest values
        }
    }
}
