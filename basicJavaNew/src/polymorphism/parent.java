package polymorphism;

public class parent {
	
	//Method overloading
	
	void m1() {
		System.out.println("This is m1 method with no param");
	}
	
	void m1(int x) {
		System.out.println("This is m1 method with single param");
	}
	
	void m1(String y) {
		System.out.println("This is m1 method with single String param");
	}
	
	void m1(char z) {
		System.out.println("This is m1 method with single char param");
	}
	
	void m1(char z, int x) {
		System.out.println("This is m1 method with single char param");
	}
	
	void m1(char z, int x, int y) {
		System.out.println("This is m1 method with three  param");
	}
	
	public static void main(String[] args) {
		parent obj = new parent();
		obj.m1('c',1,1);
	}

}
