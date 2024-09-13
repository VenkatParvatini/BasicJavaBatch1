package Constructors1;

public class Constructors6 {
	
	 Constructors6(){
		
		System.out.println("This is no param constructor");
	}
	
	 Constructors6(int x){
		
		System.out.println("This is one param constructor");
	}

	 Constructors6(String name){
		
		System.out.println("This is one param String constructor");
	}
	
	 Constructors6(int x, String name){ //Constructor overloading
		
		System.out.println("This is two param constructor");
	}
	
	public static void main(String[] args) {
		
		new Constructors6();
		 
	
	
	}
	
	
}
