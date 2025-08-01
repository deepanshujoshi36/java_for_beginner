package member_package;
//Static member example
class counter{
    private static int count = 0;   //static variable
    public counter(){     //count the number of object will created
        count++;
    }
    public static int getCount(){   //static method 
        return count;      
    }
}
public class static_member{
    public static void main(String[] args){
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();
        System.out.println("no of counter objects created is :" +counter.getCount());
    }
}

//if you want to know the difference between static of class counter and static_member go to the"2.png"