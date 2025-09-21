
public class Search_In_Strings {
    public static void main(String[] args){
        String name = " sachin joshi " ;
        char target = 'i' ;
        System.out.println(search(name , target));

    }
    static boolean search(String name , char target){
        //if the length of string is 0
        if(name.length() == 0){
            return false;
        }

//        //it checks the character is present in string or not

//        for ( int i = 0 ; i < name.length() ; i++){
//            //check for character at every index
//            if(target == name.charAt(i)){
//                return true;
//            }
//        }
                     //or
        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        //if character not found
        return false;
    }
}
