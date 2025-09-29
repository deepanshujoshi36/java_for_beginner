package com.sachin;

public class Insertion_Sort{
	public static void insertionSort(int[] arr ){
		for(int i = 1 ; i < arr.length ; i++){
			int key = arr[i];
			int j = i - 1 ;

			//shift elements that are greater than the key a step ahead
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}

			//put the key element at tha right index
			arr[j+1] = key ;
		}
	}

	//to display the array
	public static void display(int[] arr){
		for(int val : arr){
			System.out.print(val + " ");
		}
		System.out.println("end of an array");
	}

	public static void main(String[] args){
		int[] arr = { 4 , 1 , 6 , 3 , 67 , 789 , 31 };
		 
		//first we print unsorted array
		display(arr);

		//now we sort the array using insertion sort
		insertionSort(arr);

		//now print the sorted array 
		display(arr);
	}
}

