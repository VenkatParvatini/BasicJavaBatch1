package inheritance;

public class case2 extends case1{
	
	int age2=20;
	String name2 = "vamsi";
	
	void stuDetails2() {
		System.out.println("Age2 is :"+age2);
		System.out.println("name2 is :"+name2);
	}
	
	public static void main(String[] args) {
		case2 c2 = new case2();
	
		c2.stuDetails1(); //valid
		c2.stuDetails2(); //valid
		
		case1 c1 = new case1();
//		c1.stuDetails1(); //valid
//		c1.stuDetails2(); //invalid
		
		case1 c3 = new case2();
		c3.stuDetails1(); //valid
//		c3.stuDetails2(); //invalid
		
//		case2 c4 = new case1();

	}

}
