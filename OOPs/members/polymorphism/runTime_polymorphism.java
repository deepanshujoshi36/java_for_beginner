package polymorphism_package;
//run time polymorphism is also known as method overriding
class animal{
    void sound(){
        System.out.println("animal makes a sound");
    }
}
class dog extends animal{
    @Override
    void sound(){
        System.out.println("dog barks");
    }
}
public class runTime_polymorphism{

    public static void main(String[] args){
        animal s ;
        s = new animal();
        s.sound();

        s = new dog();
        s.sound();
    }
}