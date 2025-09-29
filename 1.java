class a{
	public static void main(String[] args){
		int[] arr = {3 , 5 , 2 , 7 , 7 };
		int sum ;
		int largest = 0;
		for(int a = 0 ; a < arr.length ; a++){
		for (int i = 0 ; i < arr.length; i++ ){
			if (arr[a] != arr[i]){
				sum = arr[a] + arr[i];
				if(sum > largest){
					largest = sum;
				}
			}
		}

	}
	System.out.println(largest);
}
}
