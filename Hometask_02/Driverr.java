import javax.swing.*;

class Shape {
    protected double area;
    protected double volume;

    // Default constructor
    public Shape() {
        area = 0.0;
        volume = 0.0;
    }

    // Parameterized constructor
    public Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    // Copy constructor
    public Shape(Shape s) {
        this.area = s.area;
        this.volume = s.volume;
    }

    // Method to get input (will be overridden)
    public void getInput() {
        area = Double.parseDouble(JOptionPane.showInputDialog("Enter area:"));
        volume = Double.parseDouble(JOptionPane.showInputDialog("Enter volume:"));
    }

    // Overridden toString method
    public String toString() {
        return "Area: " + area + "\nVolume: " + volume;
    }
}

class Square extends Shape {
    private double width, length, height;

    public Square() {
        super();
        width = length = height = 0.0;
    }

    public Square(double w, double l, double h) {
        super();
        width = w;
        length = l;
        height = h;
        calculate();
    }

    public Square(Square s) {
        super(s);
        this.width = s.width;
        this.length = s.length;
        this.height = s.height;
    }

    @Override
    public void getInput() {
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
        calculate();
    }

    private void calculate() {
        area = length * width;
        volume = length * width * height;
    }

    @Override
    public String toString() {
        return "Square Dimensions:\nWidth: " + width + "\nLength: " + length + "\nHeight: " + height + "\n" + super.toString();
    }
}

class Sphere extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Sphere() {
        super();
        radius = 0.0;
    }

    public Sphere(double r) {
        super();
        radius = r;
        calculate();
    }

    public Sphere(Sphere s) {
        super(s);
        this.radius = s.radius;
    }

    @Override
    public void getInput() {
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
        calculate();
    }

    private void calculate() {
        area = 4 * PI * radius * radius;
        volume = (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere Radius: " + radius + "\n" + super.toString();
    }
}
public class Driverr {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Square();
        shapes[0].getInput();

        shapes[1] = new Sphere();
        shapes[1].getInput();

        shapes[2] = new Square(4, 5, 6); // param constructor
        shapes[3] = new Sphere(3);      // param constructor

        // Display results
        for (int i = 0; i < shapes.length; i++) {
            JOptionPane.showMessageDialog(null, "Object " + (i+1) + ":\n" + shapes[i].toString());
        }
    }
}

