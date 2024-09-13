package package2;

import package1.classA;

public class ClassE {

	public static void main(String[] args) {
		classA obje = new classA();
		System.out.println(obje.name); //classA.name is not visible
	}
}
