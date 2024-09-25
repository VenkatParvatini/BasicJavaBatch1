package polymorphism;

public class child extends parent2{
	
	void m1() {
		
		System.out.println(" THis is m1 in child class");
	}
	
	public static void main(String[] args) {
		child obj = new child();
		obj.m1();
		
	}
	
}
