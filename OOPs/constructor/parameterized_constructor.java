package constructor_package;
//PARAMETERIZED CONSTRUCTOR
class car{
    String name ;
    String model ;
    String no ;
    public car(String n , String m , String num){   //INITIALIZATION OF CONSTRUCTOR
        name = n ;
        model = m ;
        no = num ;    
    }
    void display(){
        System.out.println("name :" + name) ;
        System.out.println("model :" + model) ;
        System.out.println("no :" + no) ;
        
    }
}
public class parameterized_constructor{
    public static void main(String[] args){
        car car1 = new car("swift nexa" , "fronx" , "001" ) ;
        car1.display();
    }
}

//IF YOU WANT A PROPER QUICK REVISION OF CONSTRUCTOR GO TO '4.png'