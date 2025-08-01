package class_object;
class animal{ // creating a class name animaly
    String name;
    String color;1
    public void voice(){
        System.out.println("bark");
    }
}
public class class_object{
    public static void main(String[] args){ 
        animal dog = new animal();    //creating object name dog of class animal                 
        dog.name = "max";                         
        System.out.println(dog.name);
        dog.voice();
    }
}

//if you want to know difference about animal and class_object class go to 1.png