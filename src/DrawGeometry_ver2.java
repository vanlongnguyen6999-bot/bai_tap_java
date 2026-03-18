import java.util.Scanner;

public class DrawGeometry_ver2 {
        public static void main(String[] args){
            int choice = -1;
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            switch(choice){
                case 2:
                    System.out.println("Draw the triangle");
                    System.out.println("Enter high of triangle: ");
                    int h = s.nextInt();
                    System.out.println("Triangle has a right angle at botton-left: ");
                    for(int i = h ; i >= 1 ; i--){
                        for(int j = 1 ; j <= i ; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Triangle has a right angle at top-left: ");
                    for(int i = 1 ; i <= h ; i++){
                        for(int j = 1 ; j <= i ; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Triangle has a right angle at top-right: ");
                    for(int i = 1 ; i <= h ; i++){
                        for(int j = 1 ; j <= i - 1 ; j++){
                            System.out.print(" ");
                        }
                        for(int k = 1 ; k <= (h - i + 1); k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Triangle has a right angle at botton-right: ");
                    for(int i = h ; i >= 1 ; i--){
                        for(int j = 1 ; j <= i - 1 ; j++){
                            System.out.print(" ");
                        }
                        for(int k = 1 ; k <= (h - i + 1); k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.print("Enter length of rectangle: ");
                    int len = s.nextInt();
                    System.out.print("Enter width of rectangle: ");
                    int w = s.nextInt();
                    for(int i = 0 ; i < w ; i++){
                        for(int j = 0 ; j < len ; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle: ");
                    System.out.print("Enter high of isosceles triangle: ");
                    int high = s.nextInt();
                    for(int i = 1 ; i <= high ; i++){
                        for(int j = 1 ; j <= high - i ; j++){
                            System.out.print(" ");
                        }
                        for(int k = 1 ; k <= (2*i - 1) ; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                default:
                    System.out.println("No choice!");
            }
        }
}

