public class fan {
    public static final int SLOW = 1;
    public static final  int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if(on){
            return "Fan is on: speed = " + speed + ", color = " + color + ", radius = " + radius;
        }
        else return "Fan is off: color = " + color + ", radius = " + radius;
    }
}
class fanMain{
    public static void main(String[] args) {
        fan f1 = new fan();
        f1.setSpeed(fan.FAST);
        f1.setRadius(10);
        f1.setColor("Yellow");
        f1.setOn(true);
        fan f2 = new fan();
        f2.setSpeed(fan.MEDIUM);
        f2.setRadius(5);
        f2.setColor("Blue");
        f2.setOn(false);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}