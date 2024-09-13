package Constructors1;

public class Constructors2 {
	
	
	 Constructors2() {
		System.out.println("Constructor is called");
	}
	
	 void m1() {
		System.out.println("This is method 1");
	}
	
	public static void main(String[] args) {
		
		Constructors2 obj = new Constructors2();
		obj.m1();
	}
}
