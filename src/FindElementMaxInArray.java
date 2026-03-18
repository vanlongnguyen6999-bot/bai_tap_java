import java.util.Scanner;
public class FindElementMaxInArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = s.nextInt();
        int[] a;
        a = new int[size];
        int ans = Integer.MIN_VALUE;
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter element "+(i + 1) + ": ");
            a[i] = s.nextInt();
            ans = Math.max(ans, a[i]);
        }
        System.out.print("Max element in array: " + ans);
    }
}
