package inheritance;

public class ClassB extends ClassA{
	
	void stuDetails() {
		System.out.println("Id of the student is :"+id);
		System.out.println("name of the student is :"+name);
		System.out.println("age of the student is :"+age);
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.id=10;
		a.name="venkat";
		a.age=30;
		
		ClassB b = new ClassB();
		b.id=100;
		b.name="venkat1";
		b.age=301;
		b.stuDetails();
	}
	
}
