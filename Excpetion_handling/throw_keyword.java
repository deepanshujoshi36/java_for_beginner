package finally_package;
// throw keyword
public class throw_keyword{
    public static void main(String[] args){
        try{
            validateAge(18);
        }
        catch(Exception e){
            System.out.println("exception occured " + e.getMessage());
        }
    }
    public static void validateAge(int age){
        if (age < 18){
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("Age is valid");
    }
}