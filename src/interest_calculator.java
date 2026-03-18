import java.util.Scanner;
public class interest_calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.print("Enter investment amount: ");
        money = input.nextDouble();
        System.out.print("Enter number of months: ");
        month = input.nextInt();
        System.out.print("Enter interest rate: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0 ; i < month ; i++){
            totalInterest += money * (interestRate / 100)/ 12 * month;
        }
        System.out.print("Total of interest: " + totalInterest);
    }
}
