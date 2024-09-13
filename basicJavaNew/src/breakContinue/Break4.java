package breakContinue;

public class Break4 {
	
	public static void main(String[] args) {
		
		for(int marks=1;marks<=100;marks++) {
			
			if(marks == 54) {
				
				break;
				System.out.println(marks); //Unreachable code
			}
			
		}
	}

}
