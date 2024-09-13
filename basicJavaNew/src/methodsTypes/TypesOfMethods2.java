package methodsTypes;

public class TypesOfMethods2 {
	
	int x;
	String name;
	char c;
	boolean s;
	float f;
	double d;
	
	void m1() {
		System.out.println("int x value is :"+ x);
		System.out.println("String name value is :"+ name);
		System.out.println("char c value is :"+ c);
		System.out.println("boolean s value is :"+ s);
		System.out.println("float f value is :"+ f);
		System.out.println("double d value is :"+ d);
	}
	
	public static void main(String[] args) {
		
		TypesOfMethods2 objA = new TypesOfMethods2();
		objA.m1();
		
		objA.x = 10;
		objA.name = "venkat";
		objA.c = 'a';
		objA.s = true;
		objA.f = 10.5f;
		objA.d = 14.564d;
		System.out.println("=======The updated values are========");
		objA.m1();
		
		
		TypesOfMethods2 objB = new TypesOfMethods2();
		objB.x = 20;
		objB.name = "varma";
		objB.c = 'b';
		objB.s = false;
		objB.f = 20.5f;
		objB.d = 24.564d;
		System.out.println("=======The updated 2nd values are========");
		
		objB.m1();
	}
	
	
	

}
