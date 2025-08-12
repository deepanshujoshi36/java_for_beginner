package com.sachin;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class conditions {
    public static void main(String[] args) {
        /*
        Syntax of if statement
        if(boolean expression T or F){
            //Body
        }
        else
        {
            //Do this
        }
         */
        int salary = 25000;
//        if(salary > 10000){
//            salary = salary +2000;
//        }
//        else{
//            salary = salary + 1000;
//        }

        //Multiple IF-else
        if(salary > 10000 && salary < 20000){
            salary = salary + 2000;
        }
        else if(salary > 20000){
            salary = salary + 3000;
        }
        else{
            salary = salary + 1000;
        }
        System.out.println("New salary:"+salary);
    }
}