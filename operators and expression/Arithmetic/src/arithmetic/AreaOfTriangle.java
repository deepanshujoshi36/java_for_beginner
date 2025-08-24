package arithmetic;
import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in) ;
                
                //inputs for the height and base
                float height , base ;
                System.out.println("enter the height and base :");
		height = in.nextFloat();  //taking input in height
		base = in.nextFloat();    //taking input in base
		float area = areaUsingHeight(height , base);
                System.out.println("The area is :" +area);
                
                
                //inputs for the sidess
                float A  , B , C ;
                A = in.nextFloat();
                B = in.nextFloat();
                C = in.nextFloat();
                float Area = areaUsingSides(A , B , C);
                System.out.println("The area is :"+ Area);
                
                
	}
        
        //If height and base is given 
        static float areaUsingHeight(float height , float base){
            float area = (float) ((0.5) * base * height) ;
            return area;
        }
        
        //if all the sides are given 
        static float areaUsingSides(float A , float B , float C){
            float s = (float) ((A + B + C) * (0.5)) ;
            float area = (float) Math.sqrt(s *(s-A) * (s-B) * (s-C));
            return area ;
        }
}