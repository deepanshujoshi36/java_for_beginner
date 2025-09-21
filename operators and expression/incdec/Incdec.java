
public class Incdec{
    public static void main(String[] args){
        int x1 = 5 ,x2 = 5, y , z ;
        y = x1++ ;
        z = ++x2 ;
        
        char c = 'A';
        c++;
        
        float f = 12.5f;
        f++;
        
        byte b = 4 ; 
        b++;
        
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);
        System.out.println(f);
        System.out.println(b);
    }
}