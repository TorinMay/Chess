import java.util.Scanner;

public class Atm {

	// State
	private Scanner input = new Scanner(System.in);
	private Account[] array = new Account[3];
        private Account loginAccount = null;
        private boolean loginFlag = false;

        // Constructor
        public Atm() {
                this.array[0] = new Account("Bob", "1234", 100);
	        this.array[1] = new Account("Alice", "3333", 250);
	        this.array[2] = new Account("JT", "0001", 999999999);
        }

        public boolean getLoginFlag() {
                return loginFlag;
        }

	public void login() {
		String thisName = "";
		String thisPin = "";
		
                do {
		     System.out.print("Name: ");
		     thisName = input.nextLine();
                } while (!checkName(thisName));

                do {
		     System.out.print("PIN: ");
		     thisPin = input.nextLine();
                } while (!checkPin(thisPin));
	
	}

        //checks if name exists
        public boolean checkName(String thisName) {
                for (int i = 0; i < array.length; i++) {
                     Account account = array[i];
                     if (account.getName().equals(thisName)) {
                        loginAccount = account;
                        return true;
                     }
                 }
                 System.out.println("Account " + thisName + " does not exist.");
                 return false;
        }

        //checks if pin corresponds to account name
        public boolean checkPin(String thisPin) {
                if (loginAccount != null) {
                     if (loginAccount.getPin().equals(thisPin)) {
                         loginFlag = true;
                         return true;
                     }
                } 
              System.out.println("PIN is incorrect.");
              return false;  
        }


	public void checkBalance() {
                if (loginFlag) {
		     System.out.println("Balance is: " + loginAccount.getBalance());
                }
	}

	public void withdrawFunds(double amount) {
		if (amount > 0.0 && loginFlag) {
                      loginAccount.setBalance(loginAccount.getBalance() - amount);
                      System.out.println("New balance is: " + loginAccount.getBalance());
                }
	}
	public void changeName(String newName) {
		if (loginFlag) {
                     loginAccount.setName(newName);
                     System.out.println("New account name is: " + loginAccount.getName());
                }
	}
        public void changePin(String newPin){
		if (loginFlag) {
                     loginAccount.setPin(newPin);
                     System.out.println("New PIN is: " + loginAccount.getPin());
                }
	}
	public void logout() {
                loginFlag = false;
                loginAccount = null;
                login();
	}


}
