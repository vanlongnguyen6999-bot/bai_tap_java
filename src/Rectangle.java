import java.util.Scanner;

class Rectangle {
    double width, height;
    public Rectangle(){}
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public String display(){
        return "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }
}
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = s.nextDouble();
        System.out.print("Enter the height: ");
        double height = s.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
    }
}
