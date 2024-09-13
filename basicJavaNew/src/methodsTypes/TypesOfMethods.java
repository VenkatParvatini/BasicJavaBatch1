package methodsTypes;

public class TypesOfMethods {
	
	static String name1 = "Static variable";
	String name2 = "Non Static variable";

	static void m1() {
		System.out.println("Static method");
	}
	
	void m2() {
		System.out.println("Non static method");
	}
	
	public static void main(String[] args) {
		m1();
		TypesOfMethods obj = new TypesOfMethods();
		obj.m2();
	}
}
