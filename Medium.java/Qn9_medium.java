class Circle {
    double radius;
    final double PI = 3.14159;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateCircumference() {
        return 2 * PI * radius;
    }
    double calculateArea() {
        return PI * radius * radius;
    }
    void displayDetails() {
        System.out.println("-------------------------");
        System.out.println("Radius: " + radius);
        System.out.println("Circumfrence: " + calculateCircumference());
        System.out.println("Area: " + calculateArea());
        System.out.println("-------------------------");
    }
}

public class Qn9_medium {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Circle c2 = new Circle(10);
        c1.displayDetails();
        c2.displayDetails();
    }
}
