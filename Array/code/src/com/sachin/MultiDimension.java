package com.sachin;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
//                SYNTAX
//         int[][] arr = {
//                { 1 , 2 , 3 },
//                { 4 , 5 , 6 },
//                { 7 , 8 , 9 }
//        }; 

        // or
        int[][] arr = new int[3][3];

//                      INPUT
        // general input code for 2D array(integer)
        for(int row = 0 ; row < arr.length ; row++){
            //for each col in every row
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = in.nextInt();
            }
        }

//                        OUTPUT
        //general output code for 2D array(integer)
//        for(int row = 0 ; row < arr.length ; row++){
//            for(int col = 0 ; col < arr[row].length ; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //OR

//        for(int row = 0 ; row < arr.length ; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //OR

//        enhanced for loop
        for(int[] num : arr ){
            System.out.println(Arrays.toString(num));
        }
//    we can also do
        int[][] arr2D = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        for(int row = 0 ; row < arr2D.length ; row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }

    }
}
