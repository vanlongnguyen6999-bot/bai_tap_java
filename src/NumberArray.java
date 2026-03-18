import java.util.Scanner;
public class NumberArray {
    public static int minValue(int[] a){
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            ans = Math.min(ans, a[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println("Enter size of array:");
        Scanner s = new Scanner(System.in);
        int size  = s.nextInt();
        int[] a;
        a = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter element " + (i + 1) + ":");
            a[i] = s.nextInt();
        }
        System.out.println("Min_Value of array: " + minValue(a));
    }
}
