
// Abstract Class
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double calculateArea();

    // Concrete method (has a body)
    public void display() {
        System.out.println("This is a shape.");
    }
}





// Subclass for Circle
class Circle extends Shape {
    double radius;

    // Constructor
   Circle(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void display(){
       super.display();
        System.out.println("circle diaplay");
    }

}

// Subclass for Rectangle
class Rectangle1 extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement the abstract method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to test abstraction
public class absstractClassEx {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle classes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle1(4, 6);

        // Displaying areas of different shapes
        System.out.println("Circle Area: " + circle.calculateArea());       // Output: Circle Area
        System.out.println("Rectangle Area: " + rectangle.calculateArea()); // Output: Rectangle Area

        // Displaying general information
        circle.display();      // Output: This is a shape.
        rectangle.display();   // Output: This is a shape.
    }
}
