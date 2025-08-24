package arithmetic;
import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float height , base ;
		height = in.nextFloat();
		base = in.nextFloat();
		float area = (float) ((0.5) * base * height) ;
		System.out.println(area);	
	}
}