import java.util.Scanner;
public class GreatestCommonFactor {
    public static void main(String[] args){
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = s.nextInt();
        System.out.print("Enter b: ");
        b = s.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0) System.out.print("No greatest common factor");
        else{
            while(a != b){
                if(a > b) a = a - b;
                else b = b - a;
            }
        }
        System.out.print("Greatest common factor: " + a);
    }
}
