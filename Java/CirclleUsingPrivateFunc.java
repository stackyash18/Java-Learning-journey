import java.util.Scanner;

public class CirclleUsingPrivateFunc {

    private double radius;
    private double area;
    private double circumference;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
        calculateArea();
        calculateCircumference();
    }

    private void calculateArea() {
        area = Math.PI * radius * radius;
    }

    private void calculateCircumference() {
        circumference = 2 * Math.PI * radius;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CirclleUsingPrivateFunc circle = new CirclleUsingPrivateFunc();

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        circle.setRadius(r);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        input.close();
    }
}
