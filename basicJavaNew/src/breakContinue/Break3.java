package breakContinue;

public class Break3 {
	
	public static void main(String[] args) {
		
		for(int marks=1;marks<=100;marks++) {
			
			if(marks == 54) {
				System.out.println(marks);
				break;
				 //Unreachable code
			}
			
		}
	}

}
