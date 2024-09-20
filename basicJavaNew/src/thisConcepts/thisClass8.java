package thisConcepts;

public class thisClass8 {
	
	thisClass8(){
		System.out.println("This is default constructor");
	}
	
	void m1() {
		this();
		System.out.println("This is method m1");
	}
	public static void main(String[] args) {
		thisClass8 obj = new thisClass8();
		obj.m1();
	}

}
