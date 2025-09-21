//solution of problem no: 1295

public class EvenDigits {
    public static void main(String[] args){
        int[] arr = { -1231 , 456 , 12345 , 142 , 1 , 2 };
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] arr){
        int evenNum = 0 ;
        for ( int i = 0 ; i < arr.length ; i++){
            int temp = arr[i];

            // counts the no of digits in a number
            int count = 0;

            //gives the count of a digit
            while(temp != 0){
                temp = temp / 10;
                count ++;
            }
            if(count % 2 == 0){
                evenNum ++;
            }
        }
        return evenNum;
    }
}

