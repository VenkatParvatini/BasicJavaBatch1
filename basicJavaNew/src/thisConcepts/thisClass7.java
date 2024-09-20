package thisConcepts;

public class thisClass7 {
	
	thisClass7(){
		this(6); 
		System.out.println("This is default constructor");
	}
	
	thisClass7(int x){
		System.out.println("This is one param constructor");
	}
	
	public static void main(String[] args) {
		new thisClass7();
	}

}
