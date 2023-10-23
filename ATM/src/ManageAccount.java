import java.util.Scanner;

public class ManageAccount {
    Scanner sc=new Scanner(System.in);
    public void options(){
        while(true) {
            System.out.println("Type 1:Checking Account");
            System.out.println("Type 2:Savings Account");
            System.out.println("Type 3:Exit");
            int user_choice = sc.nextInt();
            while (user_choice <= 0 || user_choice > 3) {
                System.out.println("Invalid Choice, Please enter a valid choice(1/2/3)");
                user_choice = sc.nextInt();
            }
            if (user_choice == 1) {
                checkingAccount();
            } else if (user_choice == 2) {
                savingsAccount();
            } else {
                break;
            }
        }
    }

    private void savingsAccount() {
    }

    private void checkingAccount() {
        
    }

}
