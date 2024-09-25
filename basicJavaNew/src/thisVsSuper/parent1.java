package thisVsSuper;

public class parent1 {
	
	public parent1() {
		System.out.println("This is parent class default constructor");
	}
	
	public parent1(int x) {
		System.out.println("This is parent class one param constructor");
		 //Constructor call must be the first statement in a constructor
	}
	
	public static void main(String[] args) {
		new parent1();
	}
}
