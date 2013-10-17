import java.util.Scanner;

public class AtmRunner {

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          Atm atm = new Atm();

          atm.login();
          while (atm.getLoginFlag()) {
              menu(atm, input);
          }

     }

     public static void menu(Atm atm, Scanner input) {


          System.out.println();
          System.out.println("<1> Check balance");
          System.out.println("<2> Withdraw Funds");
          System.out.println("<3> Change Account Name");
          System.out.println("<4> Change Account PIN");
          System.out.println("<5> Logout");
          
          int selection = input.nextInt();
          if (selection == 1) {
               atm.checkBalance();
          } else if (selection == 2) {
               System.out.print("Please input withdrawal amount: " );
               double amount = input.nextDouble();
               atm.withdrawFunds(amount);
          } else if (selection == 3) {
               System.out.print("Please input new account name: " );
               String newName = input.nextLine();
               atm.changeName(newName);
          } else if (selection == 4) {
               System.out.print("Please input new account PIN: " );
               String newPin = input.nextLine();
               atm.changePin(newPin);
          } else if (selection == 5) {
               atm.logout();
          } else {
                System.out.println("Selection not avaliable. Please try again.");
          }
     }



}