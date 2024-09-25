package thisVsSuper;

public class child1 extends parent1{
	
	public child1() {
		System.out.println(" This is child class default constructor");
	}
	
	public child1(int x) {
		//super();
		this(); 
		System.out.println(" This is child class one param constructor");
	}
	
	public static void main(String[] args) {
		new child1(6);
	}
}
