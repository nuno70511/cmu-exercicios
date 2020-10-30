import java.util.Scanner;

public class Circle {
    private double radius;



    /*
        Constructors
     */

    public Circle(double radius) {
        this.radius = radius;
    }



    /*
        Getters and Setters
     */

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    /*
        Methods
     */

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference () {
        return 2 * Math.PI * radius;
    }

    public void increaseRadius(double value) {
        this.radius += this.radius * (value / 100);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a value for the radius:");
        double inputRadius = sc.nextDouble();

        Circle circle = new Circle(inputRadius);

        System.out.println("radius: " + circle.getRadius());
        System.out.println("area: " + circle.getArea());
        System.out.println("circumference: " + circle.getCircumference());

        System.out.println("");

        System.out.println("Type a value to increase the radius by, in percentage:");
        double inputPercentage = sc.nextDouble();

        circle.increaseRadius(inputPercentage);

        System.out.println("radius: " + circle.getRadius());
        System.out.println("area: " + circle.getArea());
        System.out.println("circumference: " + circle.getCircumference());

        sc.close();
    }
}
