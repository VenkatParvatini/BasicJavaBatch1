package breakContinue;

public class EnchancedForLoop1 {
	
	public static void main(String[] args) {
		
		String[] jj = {"venkat","vamsi","vijay"};
		
		for(String b : jj) {
			System.out.println("Value is :"+b);
			if(b.equals("vijay")) {
				System.out.println("Hello "+b);
			}
		}
			
	}

}
