package thisConcepts;

public class thisClass6 {
	
	thisClass6(){
		System.out.println("This is default constructor");
	}
	
	thisClass6(int x){
		this();
		System.out.println("This is one param constructor");
	}
	
	public static void main(String[] args) {
		new thisClass6(10);
	}

}
