package com.sachin;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class countNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.print("Enter the number you want to count: ");
        int num =  input.nextInt();
        int count = 0;

        while(n != 0){
            if( n % 10 == num){
                count++;
            }
            n = n / 10;
        }
        System.out.println("The number of digit in the given number is: " + count);
    }


}
