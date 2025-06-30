package overloading_package;
// METHOD OVERLOADING BY CHANGING THE DATA TYPE 
class sum{
    int add(int x , int y ){        
        return x + y ;
    }
    float add(float x , float y ){               //same name as previous method
        return x + y ;
    }
}
public class change_in_data_type{
    public static void main(String[] args){
        sum s = new sum();
        System.out.println(s.add(12 , 45 ));
        System.out.println(s.add(12.6f , 34.7f));
    }
}