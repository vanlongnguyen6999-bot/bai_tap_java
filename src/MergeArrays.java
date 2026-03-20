import java.util.Scanner;
import java.util.Arrays;
public class MergeArrays {
    public static void main(String[] args){
        System.out.print("Enter size of first array: ");
        Scanner scanner = new Scanner(System.in);
        int size_1 = scanner.nextInt();
        int[] array_1;
        array_1 = new int[size_1];
        for(int i = 0 ; i < size_1 ; i++){
            System.out.print("Enter element "+ (i + 1) + " of first array: ");
            array_1[i] = scanner.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int size_2 = scanner.nextInt();
        int[] array_2;
        array_2 = new int[size_2];
        for(int i = 0 ; i < size_2 ; i++){
            System.out.print("Enter element "+ (i + 1) + " of second array: ");
            array_2[i] = scanner.nextInt();
        }
        int[] new_array;
        new_array = new int[size_1 + size_2];
        for(int i = 0 ; i < size_1 ; i++){
            new_array[i] = array_1[i];
        }
        for(int i = 0 ; i < size_2 ; i++){
            new_array[size_1 + i] = array_2[i];
        }
        System.out.println("New array after merge: " + Arrays.toString(new_array));
    }
}
