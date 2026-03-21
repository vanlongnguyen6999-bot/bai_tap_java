import java.util.Scanner;
public class DemSoLanXuatHien {
    static String str;
    private static int count(char n){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == n) count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter string: ");
        str = s.nextLine();
        System.out.print("Enter char: ");
        char n = s.nextLine().charAt(0);
        System.out.print("Số lần xuất hiện của kí tự " + n + " là: " + count(n));
    }
}
