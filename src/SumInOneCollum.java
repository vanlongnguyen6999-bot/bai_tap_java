import java.util.Scanner;
public class SumInOneCollum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number row of array: ");
        int m = s.nextInt();
        System.out.print("Enter number column of array: ");
        int n = s.nextInt();
        int[][] array = new int[m][n];
        int[] total_column = new int[n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("Enter element row " + (i + 1) +" column " + (j + 1) + ":");
                array[i][j] = s.nextInt();
                total_column[j] += array[i][j];
            }
        }
        System.out.print("Enter the values of the colum to be summed: ");
        int w = s.nextInt();
        System.out.print("Sum is: " + total_column[w - 1]);
    }
}
