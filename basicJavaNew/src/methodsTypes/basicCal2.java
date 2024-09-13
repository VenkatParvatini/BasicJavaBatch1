package methodsTypes;

public class basicCal2 {
	
	static int addition(int x,int y,int z) {
		return x+y+z;
	}
	
	static int addition(int x,int y) {
		return x+y;
	}
	
	static String addition(String x,String y) {
		return x+y;
	}
	
	static int addition(int x,int y,int a,int b) {
		return x+y+a+b;
	}
	
	static void addition(int x,int y,int a,int b, String name) {
		System.out.println(x+y+a+b+name);
	}
	
	public static void main(String[] args) {
		addition(1,2);
	}
	
	void m1(int x) {
		
	}
	
	void m1(String x) {
		
	}
	
	void m1(boolean x) {
		
	}
}
