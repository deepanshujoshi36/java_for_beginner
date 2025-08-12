package com.sachin;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Q.find the largest number among 3

//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }

                  //OR

//        int max = Math.max(Math.max(a,b),c);
//        System.out.println("The largest number is: " + max);

                  //OR

        System.out.println("The largest number is :"+ Math.max(Math.max(a , b) , c));
    }
}
