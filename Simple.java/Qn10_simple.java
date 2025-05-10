//Create Multiple Objects Create a class Car with attributes brand and year. Create two Car objects in the main method and display their details.
class Car {
    String brand;
    int year;
    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
public class Qn10_simple {
    public static void main(String[] args) {
        // Create two Car objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);
        System.out.println("Car 1 Details:");
        car1.displayDetails();
        System.out.println("\nCar 2 Details:");
        car2.displayDetails();
    }
}
