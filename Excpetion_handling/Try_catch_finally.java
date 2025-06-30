package finally_package;
//try - catch - finally
public class Try_catch_finally{
    public static void main(String[] args){
        System.out.println("let's divide ");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            System.out.println("not possible");
        }
        // will be always executed
        finally{
            System.out.println("suuccessfully runs");    
        }
    }
}