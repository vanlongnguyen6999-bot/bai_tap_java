import java.util.Scanner;
public class CountStudentPass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = s.nextInt();
        if(size > 30){
            System.out.print("Size should not exceed 30");
        }
        int[] array;
        array = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter a mark for student " + (i + 1) + ":");
            array[i] = s.nextInt();
        }
        int count = 0;
        System.out.print("List of mask: ");
        for(int i = 0 ; i < size ; i++){
            System.out.print(array[i] + "\t");
            if(array[i] >= 5 && array[i] <= 10){
                count++;
            }
        }
        System.out.println("\n The number of students passing the exam is: " + count);
    }
}
