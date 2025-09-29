package com.sachin;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//          SYNTAX
        ArrayList<Integer> list = new ArrayList<>(1);
          //add items in arrayList
//        list.add(1);
//        list.add(4);
//        list.add(6);
//        list.add(9);

//        //print the arrayList
//        System.out.println(list);

//        //update value at any index variableName.set(index , value)
//        list.set(0 , 5);
//        System.out.println(list);

//        //variableName.contains(value) check that list contain value or not
//        System.out.println(list.contains(4));
//        System.out.println(list.contains(10));

//        //variableName.remove(index) remove the value at particular index
//        list.remove(2);
//        System.out.println(list);

        //INPUT
        for(int i = 0 ; i < 5 ; i++ ){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i = 0 ;  i < 5 ; i++){
            //variableName.get(index) to get value at particular index
            System.out.println(list.get(i));  //list[index] syntax will not work here
        }
    }
}
