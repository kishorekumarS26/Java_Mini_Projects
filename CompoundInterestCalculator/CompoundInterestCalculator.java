import java.util.Scanner;
public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int years;
        int timesCompounded;
        double amount;

        System.out.println("*****Compound Interest Calculator*****");
        System.out.println("Enter the Principle Amount: ");
        principle = sc.nextDouble();
        System.out.println("Enter the Rate of Interest (in %): ");
        rate = sc.nextDouble() / 100;
        System.out.println("Enter the Number of Years: ");
        years = sc.nextInt();
        System.out.println("Enters Number of times Compounded: ");
        timesCompounded = sc.nextInt();

        amount = principle * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.printf("Compound Interest is %.2f",amount);



        sc.close();
    }
}