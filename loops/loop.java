

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        /*
        syntax of for loops
        for(initialisation ; condition ; increment/decrement){
            //body
        }
         */
        //Q. Print a number from 1 to 5:
        for(int num = 1 ; num <= 5 ; num++){
            System.out.println(num);
        }

        //Q. Print a number from 1 to n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        for(int num = 1 ; num <= n ; num++){
            System.out.println(num);
        }

        /*
        Syntax of while loop
        while(condition){
            //body
        }
         */
        int num = 1 ;
        while(num <= 5){
            System.out.println(num);
            num++;
        }
        /*
        syntax of do while
        do{
            //body
        }while(condition);

         */
        do{
            System.out.println(num);
            num++;
        }while(num <= 5);
    }
}
