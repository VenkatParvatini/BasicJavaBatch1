package thisConcepts;

public class thisClass4 {
	int a=70;
	
	 void m1() {
		 int a=10;
		System.out.println("This is method m1 with value a: "+a);
	}
	 
	 thisClass4(){
		 this.m1(); //this is used for method
		 System.out.println("The value of a is "+this.a); // this is used for variable
	 }
	 
	
	public static void main(String[] args) {
		new thisClass4();
	}

}
