//Ceiling = smallest element in array greater or equal to target


public class CeilingOfNumber {
    public static void main(String[] args){
        int[] arr = { 16 , 12 , 11 , 9 , 5 , 2};
        System.out.println(ceiling(arr , 7));
    }
    static int ceiling(int[] arr , int target ){
        int mid = 0 ,  start = 0 ;
        int end = arr.length -1 ;

        boolean ascending = arr[start] < arr[end];
        while(start <= end ){
             mid = start + (end - start)/2 ;

            if(arr[mid] == target){
                return mid;
            }
            if(ascending){

                if(target < arr[mid] ){
                    end = mid - 1 ;
                }
                else{
                    start = mid + 1 ;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1 ;
                }
                else{
                    end = mid - 1 ;
                }
            }
        }
        return start;
    }
}