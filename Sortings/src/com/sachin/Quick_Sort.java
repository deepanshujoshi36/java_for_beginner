package com .sachin;

public class Quick_Sort{

	//partion 
	static int partition(int[] arr , int low , int high){
		//take last element as pivot element 
		int pivot = arr[high];
		int i = low -1 ;
		for(int j = low ; j <= high-1 ; j++){
			if(arr[j] <= pivot){
				//move index of smaller element
				i++ ;

				swap(arr , i , j );

			}
		}
		swap(arr , i+1 , high);
		return i+1;
	}

	//method to swap two value
	static void swap(int[] arr , int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//quick sort 
	static void quickSort(int[] arr , int low , int high){
		if(low < high){

			//returns the index of pivot element and give it to pi 
			int pi = partition(arr , low , high);

			//below method will make sure that the left side of pivot will be smaller and right side will be larger than the pivot element
			quickSort(arr , low , pi-1);
			quickSort(arr , pi+1 , high);

		}
	}

	//to display array
	static void display(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args){
		int[] arr = {4 , 7 , 2 , 67 , 45 , 34 , 78 , 98 , 76 };
		int n = arr.length;

		quickSort(arr , 0 , n-1);
		display(arr);
	}
}
