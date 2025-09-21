
import java.util.Scanner;

public class Cuboid{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length breadth and height of cuboid(in m):");
        float length , breadth , height ;
        
        //below are the input needed to find area and volume of cuboid 
        length = in.nextFloat();
        breadth = in.nextFloat();
        height = in.nextFloat();
        
        //area is holding the value return by the method surfaceArea
        double area = surfaceArea(length , breadth , height);
        
        //volume is holding the value return by the method volume
        double volume = volume(length , breadth , height );
        
        //printing the value of area and volume in below 2 lines
        System.out.println("The Surface area of the given data is : " + area + " squareMetre");
        System.out.println("The volume of the given data is : " + volume + " cubicMetre");
    }
    
    //function or method to calculate total surface area of cuboid
    static double surfaceArea(float length , float breadth , float height ){
        double area;
        area = 2*( (length * breadth) + (breadth * height) + ( length * height ));
        return area ;
    }
    
    //function or method to calculate the volume of the cuboid 
    static double volume(float length , float breadth , float height){
        double volume;
        volume = length * breadth * height ;
        return volume;
    }
}