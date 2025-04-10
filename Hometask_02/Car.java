import java.util.*;

class Car {
    // Private attributes
    private String model;
    private String make;
    private int year;
    private double price;

    // Default constructor (initializes attributes with default values)
    public Car() {
        model = "Unknown";
        make = "Unknown";
        year = 0;
        price = 0.0;
    }

    // Parameterized constructor (initializes attributes with given values)
    public Car(String model, String make, int year, double price) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.price = price;
    }

    // Getter and setter methods for each attribute
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
	
	

    // Method to input data for the car attributes
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car model: ");
        model = scanner.nextLine();

        System.out.print("Enter car make: ");
        make = scanner.nextLine();

        System.out.print("Enter car year: ");
        year = scanner.nextInt();

        System.out.print("Enter car price: ");
        price = scanner.nextDouble();
    }

    // Method to display the car details
    public void showData() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Make: " + make);
        System.out.println("Car Year: " + year);
        System.out.println("Car Price: " + price);
        System.out.println("-------------------------");
    }
}


public class Driver {
    public static void main(String[] args) {
        // Create an array of 5 Car objects
        Car[] cars = new Car[5];

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter details for 5 cars
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Car " + (i + 1) + ":");
            cars[i] = new Car();  // Instantiate a new Car object
            cars[i].inputData();  // Take input data for the car
        }

        // Display the entered car details
        System.out.println("\nEntered Car Details:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Details of Car " + (i + 1) + ":");
            cars[i].showData();  // Display details of each car
        }
		
		double max = -99;
		for (int i = 0; i < 5; i++) {
			if (cars[i].getPrice() > max){
				max = cars[i].getPrice();
				}
			}
				
			
        System.out.println("Heighest price "  + ": " + max);
			

        scanner.close();
    }
}
