import java.util.Scanner;
public class FindMaxElementInTwoDimensionalArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row in the array: ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of collum in the array: ");
        int n = scanner.nextInt();
        int res = Integer.MIN_VALUE;
        int[][] array;
        array = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("Enter element collum " + (j + 1) + " in the row " + (i + 1) + ":");
                array[i][j] = scanner.nextInt();
                res = Math.max(res, array[i][j]);
            }
        }
        System.out.println("Max element in array: " + res);
    }
}
