import java.util.Scanner;
public class TheFirst20PrimeNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số số nguyên tố đầu tiên cần hiển thị: ");
        int number = s.nextInt();
        int cnt = 1;
        int n = 2;
        while(cnt <= number){
            if(MyMath.checkPrime(n)){
                System.out.print(n + " ");
                cnt++;
            }
            n++;
        }
    }
}