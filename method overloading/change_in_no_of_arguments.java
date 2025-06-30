package overloading_package;
// METHOD OVERLOADING BY CAHNGING NUMBER OF ARGUMENTS 
class sum{
    int add(int x , int y , int z ){        
        return x + y + z ;
    }
    int add(int x , int y ){               //same name as previous method
        return x + y ;
    }
}
public class change_in_no_of_arguments{
    public static void main(String[] args){
        sum s = new sum();
        System.out.println(s.add(12 , 45, 67));
        System.out.println(s.add(12 , 34));
    }
}