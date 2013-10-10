import java.util.Scanner;

public class Atm {
	private Scanner lala = new Scanner();
	private int[] array = new int[3];
	private Account bob = new Account("bob,1234", 1234, 100);
	private Account alice = new Account("alice", 3333, 250);
	private Account jt= new Account("JT", 0001, 999999999);

	public void login() {
		String thisName = "";
		int thisPin = 0;
		this.array[0] = this.bob;
		this.array[1] = this.alice;
		this.array[2] = this.jt;
		System.out.print("Name:");
		thisName = lala.next(java.lang.String);
		System.out.print("Pin:");
		thisPin = lala.nextInt();

		if () {
				
			}	
	}
	public void checkBalance() {
		System.out.println(current.getBalance());
	}
	public void withdrawFunds() {
		setBalance(balance - lala.nextInt());
	}
	public void changeName() {
		setName(lala.nextInt)
	}


}
