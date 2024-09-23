package inheritance;

public class Devara extends Harikrishna{
	
	static int gen4Assetvalue = 100000000;
	
	public static void main(String[] args) {
		
		Devara jrntr = new Devara();
		jrntr.Gen1();
		jrntr.Gen2();
		jrntr.gen3();
		
		System.out.println("The value of jrNtr assests is :"
		+gen1Assetvalue
		+gen2Assetvalue
		+gen3Assetvalue
		+gen4Assetvalue);
	}
}
