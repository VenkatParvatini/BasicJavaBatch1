package methodsTypes;

public class TypesOfMethod3 {
	
	//Type 2 - With Return Type and With Parameters
	
	public static int method1(double x, double y) {
		int add = (int)(x+y); //5.5+5.0 = 10.5 = 10  convert double to int (Casting)
		return add;
	}
	
	public static void main(String[] args) {
		System.out.println(method1(100,200.9d));
		System.out.println(method1(5,5.6d));
	}

}
