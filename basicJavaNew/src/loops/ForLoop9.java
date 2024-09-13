package loops;

public class ForLoop9 {
	
	public static void main(String[] args) {
		
		String name = "vamsi";//01234  
		//length =5
		//Max index = 5-1 =4
		String revName="";//i+s+m+a+v

		for(int i=name.length()-1;i>=0;i--) { //i=4
			revName= revName+ name.charAt(i);//
		}
		System.out.println(revName);
		
		
	}

}
