//Solution for problem no: 1672

public class MaxWealth {
    public static void main(String[] args){
        int[][] arr = {
                {1 , 2  ,5 },
                {3 , 5 , 6 },
                {2 , 3 , 5 , 10}
        };
        System.out.println(maximumWealth(arr));
    }
    static int maximumWealth(int[][] accounts){
        int maxWealth = 0;

        //customer = row
        //bank = column
        for ( int customer = 0 ; customer < accounts.length ; customer++){
            int sum = 0;
            for( int bank = 0 ; bank < accounts[customer].length ; bank++){
                sum = sum + accounts[customer][bank];
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}
