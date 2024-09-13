package methodsTypes;

public class ReturnTypes {
	
	
	int m1() {
		
		int x;
		x=10;
		
	return x;}
	
	void m2() {
		int a = 10;
		System.out.println(a);
	}
	
	static String  surname() {
		String surname = "parvatini";
		return surname;
	}
	
	static String fatherName() {
		String fatherN = "murthy";
		return fatherN;
	}
	
	static String sonName() {
		String sonN = "venkat";
		return sonN;
	}
	
	public static void main(String[] args) {
		
//	String fullFatherN = surname()+" "+fatherName();
//	String fullSonN = surname()+" "+sonName();
//	
//	System.out.println("Father name is :"+fullFatherN);
//	System.out.println("Father name is :"+fullSonN);
		
		System.out.println(surname());
		
	
	}
	
	

}
