package thisConcepts;

public class thisClass9 {
	
	thisClass9(){
		this(6);
		System.out.println("This is default constructor");
	}
	
	thisClass9(int x){
		this();
		System.out.println("This is one param constructor");
	}
	
	
	int x=10;
	
	void m1(int x) {
		x = this.x;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		thisClass9 obj=	 new thisClass9();
		obj.m1(10000);
	}

}
