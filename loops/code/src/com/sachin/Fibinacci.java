package com.sachin;
import java.util.Scanner;
public class Fibinacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Term you want: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1 ;

        int count = 1;
        while(count <= n){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

            count ++;
        }
    }
}
