package abstractPackage;
// Abstraction using abstract class
abstract class animal{
    abstract void sound();
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
class cat extends animal{
    @Override
    void sound(){
        System.out.println("cat say mewww");
    }
}
public class abstraction_using_abstractClass{
    public static void main(String[] args){
      //animal s1 = new animal();  we can't make an object of abstract class but animal s1=newdog()is correct
        animal s ;

        s = new dog();
        s.sound();

        s = new cat();
        s.sound();
    }
}