package member_package;
//final class cannot be inherited by any subclass/child class
final class data{ 

  //final variable cannot be changed (it's like a constant)
    final int roll = 100 ; 

    //final method cannot be override   
    final int get_roll(){    
        return roll;
    }
}
public class final_member{
    public static void main(String[] args){
        data d = new data();
        // d.roll = 34;     this will show error as we can't reassign a value to final variable
        System.out.println("the roll number is :"+d.get_roll());
    }
}
// if you want to know more about final keyword go to "3.png"