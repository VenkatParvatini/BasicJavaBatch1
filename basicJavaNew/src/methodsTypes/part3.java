package methodsTypes;

public class part3 {
	
	int r = 89; //instance variable
	static String s = "name";	
	
	
	void m1() { //Instance method
		System.out.println(r);
	}
	
	static void m2() { //Static method
		
		part3 obj = new part3(); // variable
		System.out.println(obj.r);
	}
	
	public static void main(String[] args) {
		part3 obj1 = new part3(); 
		obj1.m1();
	}

}
