//Initialization block
class a{
	static int count = 0;
	// this is non static initialization block it will run before the constructor always (  {} )
	{
		System.out.println(5);
	}

	// this is static initialization block it will run before the main method always , it means we can run it without writing anything in the main block  ( staic{} )
	static{
		System.out.println(3);
	}

	//this is constructor it will run everytime we create an object 
	a(){
		System.out.println(20);
		++count;
		
	}
	void show(){
		System.out.println(count);
	}
	public static void main(String[] args){

	}
}

