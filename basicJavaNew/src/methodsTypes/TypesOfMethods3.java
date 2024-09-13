package methodsTypes;

public class TypesOfMethods3 {
	
	static int x;
	static String name;
	static char c;
	static boolean s;
	static float f;
	static double d;
	
	 void m1() {
		System.out.println("int x value is :"+ x);
		System.out.println("String name value is :"+ name);
		System.out.println("char c value is :"+ c);
		System.out.println("boolean s value is :"+ s);
		System.out.println("float f value is :"+ f);
		System.out.println("double d value is :"+ d);
	}
	
	public static void main(String[] args) {
		
		TypesOfMethods3 objA = new TypesOfMethods3();
		objA.m1(); // null values
		
		x = 10;
		name = "venkat";
		c = 'a';
		s = true;
		f = 10.5f;
		d = 14.564d;
		
		TypesOfMethods3 objB = new TypesOfMethods3();
		x = 20;
		name = "varma";
		c = 'b';
		s = false;
		f = 20.5f;
		d = 24.564d;
		
		System.out.println("=======The updated 1st values are========");
		objA.m1();
		System.out.println("=======The updated 2nd values are========");
		objB.m1();
	}
	
	
	

}
