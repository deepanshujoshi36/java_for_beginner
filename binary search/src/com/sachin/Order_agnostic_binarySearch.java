
package com.sachin;
public class Order_agnostic_binarySearch {
    public static void main(String[] args){
        int[] arr = { 5 , 6 , 7 , 8 , 9 };
        int target = 9 ;
        System.out.println(orderAgnosticBinarySearch(arr , target));

    }
    static int orderAgnosticBinarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length - 1 ;

        //check if it is ascending or not+h
        boolean ascending = arr[start] < arr[end];

        while(start <= end){
             int mid = start + ( end - start)/2;
             if(arr[mid] == target){
                 return mid;
             }

             //if array is in ascending order follow this
             if(ascending) {
                 if (target < arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }

             //if array is in descending order
             else{
                 if(target < arr[mid]){
                     start = mid + 1 ;
                 }
                 else{
                     end = mid - 1 ;
                 }
             }
        }
        return -1;
    }
}
