package encapsulation;

public class atmNewCustomer extends atmSoftware{
	
	void settingNewPin() {
		atmNewCustomer obj1 = new atmNewCustomer();
		obj1.setPin(7878);
		int mypin = obj1.getPin();
		System.out.println(" My new pin is "+mypin);
	}
	
	public static void main(String[] args) {
		atmNewCustomer obj2 = new atmNewCustomer();
		obj2.settingNewPin();
	}

}
