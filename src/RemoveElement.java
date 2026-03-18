import java.util.Scanner;
public class RemoveElement {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = s.nextInt();
        int[] a;
        a = new int[size];
        int[] new_array;
        new_array = new int[size - 1];
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter element " + (i + 1) + ":");
            a[i] = s.nextInt();
        }
        System.out.print("Enter element need remove: ");
        int t = s.nextInt();
        int index_del = size + 1;
        for(int i = 0 ; i < size ; i++){
            if(a[i] == t){
                index_del = i;
                break;
            }
        }
        if(index_del == size + 1) System.out.print("Value not in array");
        else{
            int i_new = 0;
            for(int i = 0 ; i < size ; i++){
                if(i == index_del) continue;
                new_array[i_new] = a[i];
                i_new++;
            }
        }
        System.out.println("New array :");
        for(int x : new_array) System.out.print(x + " ");
    }
}
