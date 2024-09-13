package nestedIfLoop;

public class NestedIf {
	
	public static void main(String[] args) {
		
		int marks = 30;
		
		
		
		if(marks>=35 && marks <=50 ) {
			System.out.println("Student just passed");
		}
		
		else if(marks>50 && marks <=60) {
			System.out.println("Student got second class");
		}
		
		else if(marks>60 && marks <=80) {
			System.out.println("Student got first class");
		}
		
		else if(marks>80) {
			System.out.println("Student got distinction");
		}
		else {
				System.out.println("Student is Failed");
		}
		
	}

}
