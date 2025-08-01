package inheritance_package;
//  INHERITANCE
class vehicle{
    int speed = 600 ;
    void start(){
        System.out.println("car is starting ....");
    }
}
class car extends vehicle{   //here car is a subclass and vehicle is a super class
    String model = "fronx";
    void display(){
        System.out.println("car is going");
    }
}
public class inheritance{
    public static void main(String[] args){
        car p = new car();
        p.start();
        System.out.println(p.speed);
        System.out.println(p.model);
        p.display();
    }
}

