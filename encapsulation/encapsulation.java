package encapsulation_package;
//  encapsulation
class student{
    private int age;
    private String name ;
    //public getter for name 
    public String getName(){
        return name ;
    }
    //public setter for name 
    public void setName(String name){
        this.name = name ;
    }
    //public getter for age
    public int getAge(){
        return age ;
    }
    //public setter for age
    public void setAge(int age){
        if(age > 0){              //validation                 
            this.age = age ;
        }
    }
}

public class encapsulation{
    public static void main(String[] args){
        student s = new student();

        //set the value of name object
        s.setName("sachin joshi");  
        
        //set the value of age object          
        s.setAge(20);                         
        
        //s.getAge() and s.getName will get the value
        System.out.println(s.getName() + " is " + s.getAge() + " years old.");
    }
}