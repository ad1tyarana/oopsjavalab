class MathConstants {
    final double PI = 3.14159; //constant value
    final void displayPI() {                        //cannot be overridden
        System.out.println("Value of PI: " + PI);
    }
}
class Circle extends MathConstants {
    void calculateArea(double radius) {             //area of a circle
        double area = PI * radius * radius; 
        System.out.println("Area of Circle: " + area);
    }
    /*
    @Override
    void displayPI() {  // ❌ Compilation Error: Cannot override final method
        System.out.println("Attempting to override final method!");
    }
    */
}
public class Program {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.displayPI();     // Displaying the value of PI
        circle.calculateArea(5);
        // Attempting to modify the final variable (Uncommenting below will cause an error)
        /*
        circle.PI = 3.14;  // ❌ Compilation Error: Cannot assign a value to a final variable
        */
    }
}
