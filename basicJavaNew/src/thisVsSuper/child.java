package thisVsSuper;

public class child extends parent{
	
	String name = "venkat";
	
	void childMethod() {
		String name = "local";
		System.out.println("Child name is "+this.name);
		System.out.println("parent name is "+super.name);
		System.out.println("to call local variables "+name);
	}
	
	public static void main(String[] args) {
		child obj = new child();
		obj.childMethod();
	}
}
