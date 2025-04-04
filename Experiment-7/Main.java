abstract class Shape 
{abstract void calculateArea();}
class Rectangle extends Shape {
    private double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);}
}
class Circle extends Shape {
    private double radius;
    private static final double PI = 3.14;
    public Circle(double radius) {this.radius = radius;}
    @Override
    void calculateArea() {
        double area = PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.calculateArea(); 
        Shape circle = new Circle(7);
        circle.calculateArea(); 
    }
}
