package nestedIfLoop;

public class NestedIf3 {
	
	public static void main(String[] args) {
		
		int x = 70;
		
		if(x<60) {
			System.out.println("x value is less than 60");
		}
		else {
			System.out.println("x value is more than 60");
		}
		
		String output = (x<60)?"x value is less than 60":"x value is more than 60";
		
		System.out.println(output);
		
	
	}

}
