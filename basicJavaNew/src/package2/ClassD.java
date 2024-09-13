package package2;

import package1.classA;

public class ClassD extends classA{

	public static void main(String[] args) {
		classA objd = new classA();
		System.out.println(objd.name); //classA.name is not visible
	}
}
