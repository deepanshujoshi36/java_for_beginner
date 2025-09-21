
public class Find_Min {
    public static void main(String[] args){
        int[] arr = { -2 , 6 , 45 , -6 , 8 };
        //print the index of minimum value
        System.out.println(min(arr));

        //give the minimum element in array
        System.out.println(minValue(arr));
    }

              //give the index of minimum value

    static int min(int[] arr){
        // if array is empty
        if(arr.length == 0){
            System.out.println("empty array");
            return Integer.MAX_VALUE;
        }

        int min = 0;
        //if array is not empty it go in for loop
        for( int i = 1 ; i < arr.length ; i++){
            //check the minimum value for each index
            if(arr[min] > arr[i]){
                min = i ;
            }
        }
        //return minimum value index
        return min;
    }

             //give the minimum value

    static int minValue(int[] arr){
        // if array is empty
        if(arr.length == 0){
            System.out.println("empty array");
            return Integer.MAX_VALUE;
        }

        int min = 0;
        //if array is not empty it go in for loop
        for( int i = 1 ; i < arr.length ; i++){
            //check the minimum value for each index
            if(arr[min] > arr[i]){
                min = i ;
            }
        }
        //return minimum value
        return arr[min];
    }
}
