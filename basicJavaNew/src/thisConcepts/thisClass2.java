package thisConcepts;

public class thisClass2 {
	
	int a=66;
	
	 void m1() {
		int a = 7;
		System.out.println("Value of a is :"+this.a);
		System.out.println("Value of a is :"+a);
	}
	
	public static void main(String[] args) {
		thisClass2 obj = new thisClass2();
		obj.m1();
	}

}
