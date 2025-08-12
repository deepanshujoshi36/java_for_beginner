package com.sachin;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("lowercase");
        }
    }
}
