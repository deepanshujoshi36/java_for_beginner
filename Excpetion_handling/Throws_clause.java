package finally_package;
// throws clause

public class Throws_clause{
    public static void main(String[] args){
        try{
            divide(10);
        }
        catch(ArithmeticException e){
            System.out.println("error occured " + e.getMessage());
        }
    }
    static int divide(int a) throws ArithmeticException{
        return a / 0 ;
    }
}