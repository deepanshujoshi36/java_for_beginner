package polymorphism_package;
//compile time polymorphism is also known as method overloading
class adder{
    int sum(int x , int y){
        return x + y ;
    }
    int sum(int x , int y , int z){
        return x + y + z ;
    }
}
public class compileTime_polymorphism{
    public static void main(String[] args){
        adder add = new adder();
        System.out.println("sum is " + add.sum(100 , 300));
        System.out.println("sum is " + add.sum(100 , 30 , 5));
    }
}
// if you want more about compile time polymorphism go to folder method overloading