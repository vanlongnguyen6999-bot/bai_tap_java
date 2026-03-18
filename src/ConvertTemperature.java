import java.util.Scanner;
public class ConvertTemperature {
    public static double CtoF(double n){
        return (9.0 / 5) * n + 32;
    }
    public static double FtoC(double n){
        return (5.0 / 9) * (n - 32);
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("0. Exit");
        System.out.println("Enter choice: ");
        int choice = s.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter celsius value: ");
                double n = s.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + CtoF(n));
                break;
            case 2:
                System.out.println("Enter fahrenheit value: ");
                double a = s.nextDouble();
                System.out.println("Fahrenheit to Celsius: " + FtoC(a));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("No choice");
        }
    }
}

