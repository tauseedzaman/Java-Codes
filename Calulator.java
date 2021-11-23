public class Calulator {

    public static void main(String[] args) {
        
    }

}

// create class for calculating area of circle
class Circle {
    // create variable for radius
    private double radius;

    // create constructor for circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // create method for calculating area of circle
    public double area() {
        return Math.PI * radius * radius; 
    }
}
//create class for calculating area of rectangle
class Rectangle {
    // create variable for length and width
    private double length;
    private double width;

    // create constructor for rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // create method for calculating area of rectangle
    public double area() {
        return length * width;
    }
}

// create class for calculating area of square
class Square {
    // create variable for side
    private double side;

    // create constructor for square
    public Square(double side) {
        this.side = side;
    }

    // create method for calculating area of square
    public double area() {
        return side * side;
    }
}

// create class for calculating area of triangle
class Triangle {
    // create variable for base and height
    private double base;
    private double height;

    // create constructor for triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // create method for calculating area of triangle
    public double area() {
        return base * height / 2;
    }
}
// create class for calculating area of trapezoid
class Trapezoid {
    // create variable for base1, base2, height
    private double base1;
    private double base2;
    private double height;

    // create constructor for trapezoid
    public Trapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    // create method for calculating area of trapezoid
    public double area() {
        return (base1 + base2) * height / 2;
    }
}

// create class for calculating area of ellipse
class Ellipse {
    // create variable for radius1 and radius2
    private double radius1;
    private double radius2;

    // create constructor for ellipse
    public Ellipse(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    // create method for calculating area of ellipse
    public double area() {
        return Math.PI * radius1 * radius2;
    }
}
