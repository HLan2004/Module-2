import java.util.Locale;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter investment amount: ");
        money = input.nextDouble();

        System.out.println("Enter number of months: ");
        month = input.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
