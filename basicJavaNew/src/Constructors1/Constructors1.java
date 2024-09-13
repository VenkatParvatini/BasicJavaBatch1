package Constructors1;

public class Constructors1 {
	
	
	public Constructors1() {
		System.out.println("Constructor is called");
	}
	
	public void m1() {
		System.out.println("This is method 1");
	}
	
	public static void main(String[] args) {
		
		Constructors1 obj = new Constructors1();
		obj.m1();
	}
}
