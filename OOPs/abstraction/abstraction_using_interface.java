package abstractPackage;
interface Bicycle{
    int a = 20 ;     //act like a final
    void applyBrake();
}
interface Cycle{
    void speedUp();
}
class AvonCycle implements Bicycle , Cycle{
    // if we implement interface method then it should be always public
    public void applyBrake(){
    System.out.println("applied the break");
    }
    public void speedUp(){
        System.out.println("speed up");
    }
    
}
public class abstraction_using_interface{
    public static void main(String[] args){
        AvonCycle a = new AvonCycle();
        a.applyBrake();
        a.speedUp();
        // a.a = 12;   is not possible we can't modify value of a interface integer
        System.out.println(a.a);

    }
}