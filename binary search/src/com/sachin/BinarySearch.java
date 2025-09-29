// for array sorted in ascending order
package com.sachin;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = { 1 , 2  , 3 , 4 , 5 , 6 , 7 , 8 , 45 , 455 , 4555  , 9999};
        int target = in.nextInt();

        //print the true or false that the element is found or not
        System.out.println(binarySearch(arr , target));

        //print the index of the element if not found return -1
        System.out.println(binarySearch1(arr , target));



    }

    //return True or false on the basis of element is found or not
    static boolean binarySearch(int[] arr , int target ){
        int ub = arr.length - 1 ;
        int lb = 0 ;
        while ( lb <= ub ) {

            //find the mid element of array between range lb and ub
//          int mid = (ub + lb) / 2 ; // might exceed the range of integer so use this
            int mid = lb + ((ub - lb)/2);

            if (arr[mid] == target) {
                return true;
            }
            if( target < arr[mid] ){
                ub = mid -1 ;
            }
            else{
                lb = mid + 1;
            }
        }
        return false;
    }

    //return the index of the element you are searching
    static int binarySearch1(int[] arr , int target ){
        int ub = arr.length - 1 ;
        int lb = 0 ;

        //this loop will run until it finds the element if element is present in the array
        while ( lb <= ub ) {


            //find the mid element of array between range lb and ub
//          int mid = (ub + lb) / 2 ; // might exceed the range of integer so use this
            int mid = lb + (ub - lb)/2;

            if (arr[mid] == target) {
                return mid;
            }
            if( target < arr[mid] ){
                ub = mid -1 ;
            }
            else{
                lb = mid + 1;
            }
        }
        System.out.println("element not found");
        return -1;
    }

}