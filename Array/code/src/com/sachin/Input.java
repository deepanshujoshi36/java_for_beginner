package com.sachin;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
//        arr[0] = 2 ;
//        arr[1] = 3 ;
//        arr[2] = 4 ;
//        arr[3] = 5 ;
//        arr[4] = 6 ;
//        System.out.println(arr[4]);

        //input using for loops
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = in.nextInt();
        }

        //output using for loop
//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }

        // OR enhanced form can be
//        for(int num : arr){   //go through every index of array arr
//            System.out.print(num + " " );  // here num is representing the elements of an array
//        }

//        System.out.println(arr[5]);  // index out of bound error

        System.out.println(Arrays.toString(arr)); //import java.util.Arrays;  OUTPUT :[2, 3, 4, 5, 6]

        //array of objects
        String[] str = new String[5];

        //input using for loop
        for (int j = 0 ; j < str.length ; j++){
            str[j] = in.next();
        }

        //output using toString
        System.out.println(Arrays.toString(str));

    }

}
