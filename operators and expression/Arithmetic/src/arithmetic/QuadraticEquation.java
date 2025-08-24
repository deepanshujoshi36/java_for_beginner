package arithmetic;
import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float a , b , c , d ;
        
        System.out.println("equation is in the form of aX^2 + bX - c = 0 :\n  give the input for a , b and c  so we will give you the root ");
        a = in.nextFloat(); //taking input in a
        b = in.nextFloat(); //taking input in b
        c = in.nextFloat(); //taking input in c
        d = (float)Math.sqrt((b * b ) - (4 * a * c ));
        
        double[] roots = quadratic( a , b , d );
        System.out.println("roots are :" + roots[0] + "and " + roots[1]);
        
    }
    
    //return roots in array form index 0 will be root1 and index 1 will be root2
    static double[] quadratic(float a , float b ,float d ){
        double r1 , r2 ;
        if(d == 0){
            r1 = r2 = (double) (-b ) / (2 * a) ;
            return new double[]{r1 , r2 };
        }
        else{
            if(d > 0){
                r1 = (double)( -b - d )/(2 * a) ;
                r2 = (double)( -b + d )/(2 * a) ;
                return new double[]{r1 , r2 };
            }
            else{
                System.out.println("imaginary root");
                return new double[]{};
            }
        }
    }
}



