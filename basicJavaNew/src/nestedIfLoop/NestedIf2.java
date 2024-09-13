package nestedIfLoop;

public class NestedIf2 {
	
	public static void main(String[] args) {
		
		int x = 70;
		int y = 40;
		int z = 50;
		
		if(x>z) {
			System.out.println("Value of x is greater then z");
			if(z>y) {
				System.out.println("Value of z is greater then y");
				if(y>x) {
					System.out.println("Value of y is greater then x");
				}
				else {
					System.out.println("Value of y is less than x");
				}
			}
		}
		
		
	
	}

}
