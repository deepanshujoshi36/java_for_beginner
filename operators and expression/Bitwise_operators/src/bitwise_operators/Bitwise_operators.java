//we are performing bitwise operations in this code 
package bitwise_operators;

public class Bitwise_operators {
    public static void main(String[] args, int X) {
        int x = 0b1010 , y = 0b0110 , z ;   // x = 10 and y = 6 which is written in binary form 
        
//        performing AND operations
        z = x & y ;
        System.out.println(z) ;
        
//        performing OR operation
        z = x | y ;
        System.out.println(z) ;
        
//        performing XOR operation 
        z = x ^ y ;
        System.out.println(z) ;
        
//        performing LEFT SHIFT Operation
        z = x << 1 ;   
        System.out.println(z);
        
//        performing RIGHT SHIFT Operation 
        z = x >> 1 ;
        System.out.println(z);
        
//        alloting negative number to x
        x = -0b1010 ;    // here x = -10 which is written in binary number 
        
//        performing LEFT SHIFT Operation on negative number
        z = x << 1 ;
        System.out.println(z);
        
//        performing RIGHT SHIFT Operation on negative number 
        z = x >> 1 ;
        System.out.println(z);
        
//     performing UNSIGNED RIGHT SHIFT ON NEGATIVE NUMBER 
        z = X >>> 1 ;
        System.out.println(z);
       
    }
    
}
