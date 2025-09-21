
import java.lang.reflect.Array;
import java.util.Arrays;

public class Max_At_2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };
        //maximum value element in the array
        int ans = max2D(arr);
        System.out.println(ans);

        //maximum value index
        int[] ans1 = max2Dindex(arr);
        System.out.println(Arrays.toString(ans1));
    }

    //give maximum value from the 2D array
    static int max2D(int[][] arr) {
        //if array is empty
        if (arr.length == 0) {
            System.out.println("empty array");
            return Integer.MAX_VALUE;
        }

        int max = arr[0][0];

        //if array is not empty it will go in loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (max < arr[row][col]) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    //give maximum value index
    static int[] max2Dindex(int[][] arr) {
        //if array is empty
        if (arr.length == 0) {
            System.out.println("empty array");
            return new int[]{-1 , -1 };
        }

        int maxrow = 0;
        int maxcol = 0;

        //if array is not empty it will go in loop
        for (int row = 0; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[maxrow][maxcol] < arr[row][col]) {
                    maxrow = row;
                    maxcol = col;
                }
            }
        }
        return new int[]{maxrow , maxcol};
    }

}
