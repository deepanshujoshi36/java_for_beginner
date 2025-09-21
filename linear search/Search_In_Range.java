
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Search_In_Range {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 };

        //taking input the starting range
        int start = in.nextInt();

        //taking input the ending range
        int end = in.nextInt();

        //taking input the element we want to find
        int target = in.nextInt();

        //printing output the index if -1 means not found
        System.out.println(searchInRange(arr , start , end , target));
    }

    //function which checks that the element is present in range and return index
    static int searchInRange(int[] arr , int start , int end , int target){
        //if array is empty
        if(arr.length == 0 ){
            System.out.println("empty array");
            return -1 ;
        }

        //if array is not empty check for the element in range which is given
        for ( int i = start ; i <= end ; i++){
            if(arr[i] == target){
                return i;
            }
        }

        //if element not found
        return -1;
    }
}
