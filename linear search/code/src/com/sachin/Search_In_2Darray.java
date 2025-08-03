package com.sachin;

import java.util.Arrays;
import java.util.Scanner;

public class Search_In_2Darray {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int[][] arr = {
                {1 , 2 ,3 },
                {4 , 5 },
                {6 , 7 , 8 , 9}
        };
        int target = in.nextInt();
        int []ans = search(arr , target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr , int target){
        //if array is empty
        if(arr.length == 0){
            System.out.println("empty array");
            return new int[]{-1,-1};
        }

        //if array is not empty go for loop
        for(int row = 0 ; row < arr.length ; row ++){
            for(int col = 0 ; col < arr[row].length ; col++){
                //check at each index for element
                if(arr[row][col] == target){
                    return new int[]{ row , col } ;
                }
            }
        }
        //if element is not found
        return new int[]{-1 , -1 } ;
    }
}
