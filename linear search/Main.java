
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= { 2 , 45 , 67 , 3 , 78 , 8 };
        System.out.print("Enter the item you want to find: ");

        //taking input that which element we are searching
        int target = in.nextInt();

        //giving the index of element
        System.out.println( linearSearch(arr , target));

        //giving the element if element is found
        System.out.println(linearSearch1(arr , target));

        //give only true or false based on item found or not
        System.out.println( linearSearch2(arr , target));

    }

    //Search the element in array : if found return true otherwise false
    static boolean linearSearch2(int[] arr , int target){
        //if the array is empty gives false
        if(arr.length == 0){
            System.out.println("empty array");
            return false ;
        }

        //if array is not empty it will search by using loop
        for(int index = 0 ; index < arr.length ; index++){
            //check for item at every index
            if(arr[index] == target){
                return true ;
            }
        }
        //if item not found in array it will return false, which indicates the item is not found;
        return false ;
    }


    //search the element in array : if found return the element
    static int linearSearch1(int[] arr , int target){
        //if the array is empty
        if(arr.length == 0){
            System.out.println("empty array");
            return Integer.MAX_VALUE ;
        }

        //if array is not empty it will search by using loop
        for(int index = 0 ; index < arr.length ; index++){
            //check for item at every index
            if(arr[index] == target){
                return arr[index] ;
            }
        }
        //if item not found in array it will return garbage value , which indicates the item is not found;
        System.out.println("Not found ...");
        return Integer.MAX_VALUE ;
    }


    //Search in the array :return the index if the item is found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr , int target){
        //if the array is empty
        if(arr.length == 0){
            System.out.println("empty array");
            return -1 ;
        }

        //if array is not empty it will search by using loop
        for(int index = 0 ; index < arr.length ; index++){
            //check for item at every index
            if(arr[index] == target){
                return index ;
            }
        }
        //if item not found in array it will return -1 , which indicates the item is not found;
        System.out.println("Not found ...");
        return -1 ;
    }
}