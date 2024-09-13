package loops;

public class ForLoop8 {
	
	public static void main(String[] args) {
		
		String name = "praneeth Varma";//01234  
		System.out.println(	m1(name));
	}
	
	public static String m1(String name) {
		String revName="";//i+s+m+a+v

		for(int i=name.length()-1;i>=0;i--) { //i=4
			revName= revName+ name.charAt(i);//
		}
		return revName;
	}

}
