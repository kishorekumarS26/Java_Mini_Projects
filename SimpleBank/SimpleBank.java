import java.util.Scanner;
public class SimpleBank {
    static Scanner sc = new Scanner(System.in);
    static double balance = 0;
    
    public static void main(String[] args) {

        
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("***************************");
            System.out.println("Simple Bank");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit Message");
            System.out.println("***************************");

            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

        System.out.print("Thank you! Have a Nice Day!");

    }

    static void showBalance(double balance) {
        System.out.println("***************************");
        System.out.printf("$ %.2f\n", balance);
        System.out.println("***************************");
    }

    static double deposit() {
        double amount;
        System.out.println("Enter the amount to be Deposited: ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Amount can not be negative");
        } else {
            return amount;
        }
        return 0;
    }

    static double withdraw(double balance){
        System.out.println("Enter the amount to Withdrawn: ");
        double amount = sc.nextDouble();
        if(amount > balance){
            System.out.println("Insufficient Funds");
            return 0;
        }else if(amount < 0){
            System.out.println("Amount  can't be negative.");
            return 0;
        }
        return amount;

    }

}