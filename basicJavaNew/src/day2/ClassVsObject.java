package day2;

public class ClassVsObject {
	
	static int sbi = 10;
	
	static void vamsi() {
		System.out.println("Fresher Student");
	}
	
	
public static void main(String[] args) {
		
		System.out.println("Venkat");
		
	
		
		ClassVsObject A = new ClassVsObject();
		A.varma();
		A.vamsi();
		A.vamsi();
		
		System.out.println("The percentage of sbi is "+sbi+"%");
		ClassVsObject B = new ClassVsObject();
		B.vamsi();
		B.varma();
		varma2();
	}


	 void varma() {
		
		System.out.println("Experienced Student");
		
	}
	
	static void varma2() {
			System.out.println("Experienced Student 2");
			
		}
	
	
}

