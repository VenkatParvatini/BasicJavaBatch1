package thisConcepts;

public class thisClass5 {
	int a=70;
	
	 void m1() {
		 int a=10;
		System.out.println("This is method m1 with value a: "+a);
	}
	 
//	 thisClass5(){
//	
//		 System.out.println("The value of a is "+this.a);
//		 this.m1(); //this is used for method// this is used for variable
//	 }
	 
	 void m2() {
		 System.out.println("This is method 2");
		this.m1();
	 }
	 
	
	public static void main(String[] args) {
		thisClass5 obj =new thisClass5();
		obj.m2();
	}

}
