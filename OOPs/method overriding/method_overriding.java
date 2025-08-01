package overriding_package;
// METHOD OVERRIDING
//super class
class character{              
    void game(){                                                                
        System.out.println("select the character");
    }
}
//subclass
class wizard extends character{
    @Override
    void game(){
        System.out.println("you selected a wizard");
    }
}
public class method_overriding{
    public static void main(String [] args){
        character p1 = new character();           //output: "select the character"
        character p2 = new wizard();              //output: "you selected a wizard"
    //  wizard p3 = new character();
    //  will cause an error because Because we’re trying to assign a parent object to a child reference — which is  not allowed in Java.
        p1.game();
        p2.game();
    }
}


//for better understanding see the code "example_overriding.java"