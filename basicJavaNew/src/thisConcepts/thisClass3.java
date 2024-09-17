package thisConcepts;

public class thisClass3 extends thisClass2{
	
	
	 void m1(int a) {
		 a=this.a;
	System.out.println(a);
	}
	
	public static void main(String[] args) {
		thisClass3 obj = new thisClass3();
		obj.m1(9);
	}

}
