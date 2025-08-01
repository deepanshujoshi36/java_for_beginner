package com.sachin;

public class Main {
    public static void main(String[] args) {
        //Q= enter 5 roll no;
        int rolln1 = 2113;
        int rolln2= 2311;
        int rolln3 = 231;
        int rolln4 = 213;
        int rolln5 = 123;

        //Syntax
        //datatype[] variableName = new dataType[size];
        //Store 5 roll number
        int[] rollNo = new int[5];
        //OR
        int[] rollNO = { 23, 56,67,89,56};

        int[] ros ; //declaration of array : ros is getting defined in stack
        ros = new int[5]; //initialisation :actually here object is being created in the memory(heap)


        String[] arr = new String[5];
        System.out.println(arr[3]);
    }
}
