public class Rectangle {
    private double width;
    private double height;
    private final String COLOR = "#ffffff";



    /*
        Constructors
     */

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    /*
        Getters and Setters
     */

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return COLOR;
    }



    /*
        Methods
     */

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.height;
    }



    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("width: " + rect.getWidth());
        System.out.println("height: " + rect.getHeight());
        System.out.println("color: " + rect.getColor());
        System.out.println("area: " + rect.getArea());
        System.out.println("perimeter: " + rect.getPerimeter());

        System.out.println("");

        Rectangle rect2 = new Rectangle(4, 5);
        System.out.println("width: " + rect2.getWidth());
        System.out.println("height: " + rect2.getHeight());
        System.out.println("color: " + rect2.getColor());
        System.out.println("area: " + rect2.getArea());
        System.out.println("perimeter: " + rect2.getPerimeter());
    }
}
