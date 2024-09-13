package dataTypes;

public class integralDT {
	
	public static void main(String[] args) {
		byte a =10;
//		byte b =129; //cannot convert from int to byte
		
		short c = -32768;
//		short d = 32768; //cannot convert from int to short
		
		int e =1999999999; //type int is out of range 
		
		long f = 9223372036854775807L;
		//9223372036854775807 of type int is out of range 
		
		long g = 922337203; //9223372036854775808L of type long is out of range 
//		int h = 9223372039L; //cannot convert from long to int
		
		
		
		 //cannot convert from double to float
		float o = 13.58888888888f;
		
		double u = 12.277777777777;
		
		double p = 16.277777777777f;
//		float y = 16.277777777777; //cannot convert from double to float
		
		
		double q = 1033434;
		double w = 1033434L;
//		long rt = 10.4; //cannot convert from double to long
//		int i = 10.565f; // cannot convert from float to int
		
		
		System.out.println(w);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);
		System.out.println(u);
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);
		
		char cc = 10;
		System.out.println(10+30+"Test"+10+30);
		
		String gg = "Test";
		 gg = "Test1";
		
		int aw =10;
		 aw = 20;
		 
		 System.out.println(gg+aw);
		
	}

}
