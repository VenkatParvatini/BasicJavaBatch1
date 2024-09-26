package encapsulation;

public class atmSoftware {
	
	private int pin;
	private String customerName;

	
	public void setPin(int pin) {
		this.pin =pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	
}
