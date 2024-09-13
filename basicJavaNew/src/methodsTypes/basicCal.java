package methodsTypes;

public class basicCal {
	
	static int addition(int x,int y,int z) {
		return x+y+z;
	}
	
	static int addition2(int x, int y) {
		return x+y;
	}
	
	static void concat(String x, String y) {
		String name = x+y;
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		System.out.println(addition(30, 40,10));
		System.out.println(addition2(100, 200));
		concat("Parvatini", " Venkat");
		concat("Parvatini", " Murthy");
	}
}
