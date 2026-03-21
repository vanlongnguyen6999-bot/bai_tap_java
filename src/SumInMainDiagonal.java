import java.util.Scanner;
public class SumInMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of row and column: ");
        int m = scanner.nextInt();
        int[][] array = new int[m][m];
        int sum = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print("Enter element in row " + (i + 1) + " column " + (j + 1) + ":");
                array[i][j] = scanner.nextInt();
                if(i == j) sum += array[i][j];
            }
        }
        System.out.print("Sum in main diagonal of array is: " + sum);
    }
}
