import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public double dualRoot() {
        return -b / (2 * a);
    }

    public double getRoot1(double d) {
        return (-b - Math.sqrt(d)) / (2 * a);
    }

    public double getRoot2(double d) {
        return (-b + Math.sqrt(d)) / (2 * a);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = s.nextDouble();
        System.out.print("Enter b: ");
        double b = s.nextDouble();
        System.out.print("Enter c: ");
        double c = s.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm duy nhất: x = " + (-c / b));
            }
        } else {
            double delta = q.delta();

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (Math.abs(delta) < 1e-9) {
                System.out.println("Phương trình có nghiệm kép: x = " + q.dualRoot());
            } else {
                System.out.println("Phương trình có hai nghiệm:");
                System.out.println("x1 = " + q.getRoot1(delta));
                System.out.println("x2 = " + q.getRoot2(delta));
            }
        }

        s.close();
    }
}