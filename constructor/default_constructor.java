package constructor_package;
//DEFAULT CONSTRUCTOR
class car{
    int no;
    String name;
    String model;
    public car(){ //initialization of a default constructor
        name = "swift nexa";
        model = "fronx";
        no = 001; 
    }
}
public class default_constructor{
    public static void main(String[] args){
        car car1 = new car();  
        System.out.println(car1.model);
        System.out.println(car1.name);
        System.out.println(car1.no);
    }
}