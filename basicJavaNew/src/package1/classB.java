package package1;

public class classB extends classA {  //child//subclass  Of  Parent class

	public static void main(String[] args) {
		classA objb = new classA();
		System.out.println(objb.name); //classA.name is not visible
	}
}
