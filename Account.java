public class Account {

	//State
	private String name;
	private int pin;
	private double balance;

	//Constructor
	public Account(String name, int pin, double balance) {
		setName(name);
		setPin(pin);
		setBalance(balance);
	}

	//Behavior
	public void getName() {
		if (name.length() > 0 && name.length() < 20) {
			this.name = name;
		}
	}

	public void getPin() {
		return pin;
	}

	//name getter
	public String name() {
		return name;
	}

	//name setter
	public void setName(String name) {

	}

	//pin getter
	public int pin() {
		return pin;
	}

	//pin setter
	public void setPin(int pin) {
		if (pin.length() == 4) {
			this.pin = pin;
		}
	}

	//balance getter
	public double balance() {
		return balance;
	}

	public double setBalance(double balance) {

	}



}