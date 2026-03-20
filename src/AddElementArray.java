import java.util.Scanner;
import java.util.Arrays;
public class AddElementArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = s.nextInt();
        int[] array;
        array = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = s.nextInt();
        }
        System.out.print("Enter index: ");
        int index = s.nextInt();
        if(index < 1 || index > array.length + 1){
            System.out.print("Index not valid");
            return;
        }
        System.out.print("Enter value: ");
        int value = s.nextInt();
        int[] new_array;
        new_array = new int[size + 1];
        for(int i = 0 ; i < size + 1; i++){
            if(i == index - 1){
                new_array[i] = value;
            }
            else if(i < index - 1){
                new_array[i] = array[i];
            }
            else if(i > index - 1){
                new_array[i] = array[i - 1];
            }
        }
        System.out.println("New array: " + Arrays.toString(new_array));
    }
}
