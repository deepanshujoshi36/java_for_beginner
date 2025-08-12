package com.sachin;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int reversed = 0;
        int temp = num;
        //Q. Reversed the number.
        while(temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;     //reversed = reversed * 10 + (temp % 10)
            temp = temp / 10;
        }
        System.out.println("The reversed number is : " + reversed);

//        //Q.check the number is palindrome or not
//        if(num == reversed){
//            System.out.println("PALINDROME NUMEBR");
//        }
//        else{
//            System.out.println("Not a Palindrome number");
//        }
    }
}
