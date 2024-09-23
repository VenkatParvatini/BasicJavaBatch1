package inheritance;

public class Harikrishna extends SrNTR{
	
	static int gen3Assetvalue = 10000;
	
	public static void main(String[] args) {
		Harikrishna hari = new Harikrishna();
		hari.Gen2();
		hari.Gen1();
	}
	
	void gen3() {
		System.out.println("I am gen 3 and my name is harikrishna");
	}

}
