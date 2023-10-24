import java.util.Scanner;

public class ManageAccount {
    Scanner sc=new Scanner(System.in);
    private static int ca;
    private static int sa;

    public ManageAccount(){
        ca=0;
        sa=0;
    }
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
    private void checkingAccount(){
        while(true) {
            System.out.println("Type 1: View Balance");
            System.out.println("Type 2:Deposit Amount");
            System.out.println("Type 3:Withdraw Amount");
            System.out.println("Type 4:Exit");
            int user_choice = sc.nextInt();
            while (user_choice > 4 || user_choice <= 0) {
                System.out.println("Invalid choice, Please Enter a valid choice(1/2/3/4)");
                user_choice=sc.nextInt();
            }
            if (user_choice == 1) {
                viewBalance(false);
            } else if (user_choice == 2) {
                System.out.println("Enter the amount to deposit");
                int amount=sc.nextInt();
                while(amount<=0){
                    System.out.println("Amount can't be Negative or Zero, Please enter a positive amount");
                    amount=sc.nextInt();
                }
                Deposit(false,amount);
            } else if (user_choice == 3) {
                System.out.println("Enter the amount to withdraw");
                int amount=sc.nextInt();
                while(amount>ca){
                    System.out.println("Insufficient funds,Please Enter a valid amount");
                    amount=sc.nextInt();
                }
                while(amount<=0){
                    System.out.println("Amount can't be Negative or zero,Please Enter a valid amount");
                }
                withDraw(false,amount);
            } else {
                break;
            }
        }
    }
    private void savingsAccount(){
        while(true) {
            System.out.println("Type 1: View Balance");
            System.out.println("Type 2:Deposit Amount");
            System.out.println("Type 3:Withdraw Amount");
            System.out.println("Type 4:Exit");
            int user_choice = sc.nextInt();
            while (user_choice > 4 || user_choice <= 0) {
                System.out.println("Invalid choice, Please Enter a valid choice(1/2/3/4)");
                user_choice=sc.nextInt();
            }
            if (user_choice == 1) {
                viewBalance(true);
            } else if (user_choice == 2) {
                System.out.println("Enter the amount to deposit");
                int amount=sc.nextInt();
                while(amount<=0){
                    System.out.println("Amount can't be Negative or Zero, Please enter a positive amount");
                    amount=sc.nextInt();
                }
                Deposit(true,amount);
            } else if (user_choice == 3) {
                System.out.println("Enter the amount to withdraw");
                int amount=sc.nextInt();
                while(amount>sa){
                    System.out.println("Insufficient funds,Please Enter a valid amount");
                    amount=sc.nextInt();
                }
                while(amount<=0){
                    System.out.println("Amount can't be Negative or zero,Please Enter a valid amount");
                }
                withDraw(true,amount);
            } else {
                break;
            }
        }
    }
    private void viewBalance(boolean sav){
        if(sav)
            System.out.println("Total Balance:"+sa);
        else{
            System.out.println("Total Balance:"+ca);
        }
    }
    private void Deposit(boolean sav,int amount){
        if(sav)sa+=amount;
        else ca+=amount;
        System.out.println("Deposit Success!!");
    }
    public void withDraw(boolean sav,int amount){
        if(sav){
            sa-=amount;
            System.out.println("Withdrawn :"+amount+"Remaining Bal: "+sa);
        }
        else{
            ca-=amount;
            System.out.println("Withdrawn :"+amount+"Remaining Bal: "+ca);
        }
    }
}
