import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        int size;
        int[] array;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = s.nextInt();
        array = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = s.nextInt();
        }
        for(int j = 0 ; j < array.length /2  ; j++){
            int tmp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = tmp;
        }
        System.out.println("New array after reverse: ");
        for(int x : array) System.out.print(x + " ");
    }
}
