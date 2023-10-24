import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private HashMap<String,AccountDetails> hm =new HashMap<>();
    public void startDisplay(){
       while (true) {
           System.out.println("Type 1:Create Account");
           System.out.println("Type 2:Login");
           System.out.println("Type 3:Exit");
           int user_choice = sc.nextInt();
           while(user_choice<=0 || user_choice>3) {
               System.out.println("Invalid Choice,Please enter a valid choice(1/2/3)");
               user_choice = sc.nextInt();
           }
           if (user_choice == 1) {
               createAccount();
           }
           else if (user_choice == 2) {
               Login();
           }
           else if (user_choice == 3) {
               break;
           }
       }
    }

    private void Login() {
        System.out.println("Enter your UserID");
        String cust=sc.nextLine();
        sc.nextLine();
        while(!hm.containsKey(cust)){
            System.out.println("Invalid UserId, Please enter a valid User ID");
            cust=sc.nextLine();
        }
        System.out.println("Enter your Password");
        String pas=sc.nextLine();
        while(!hm.get(cust).getPin().equals(pas)){
            System.out.println("Invalid Password, Please enter a valid Password");
            pas=sc.nextLine();
        }
        System.out.println("Login Successful !!");
        ManageAccount mg=new ManageAccount();
        mg.options();
    }

    private void createAccount() {

        System.out.println("Enter your UserID");
        String cust_id=sc.nextLine();
        sc.nextLine();
        if(hm.containsKey(cust_id)) {
            System.out.println("You are already a registered customer");
            return;
        }
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Enter your password");
        String pin=sc.nextLine();
        System.out.println("Enter your account number");
        String acc=sc.nextLine();
        System.out.println("Enter your phone number");
        String ph_no=sc.nextLine();
        hm.put(cust_id,new AccountDetails(name,pin,acc,ph_no));
        System.out.println("Successfully Registered!!");
    }
}
