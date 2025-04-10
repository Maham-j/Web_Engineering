import java.util.*;

class Student {
    // Private data members
    private int rollno;
    private String name;
    private String email;
    private String address;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "";
        this.email = "";
        this.address = "";
    }

    // Parameterized constructor
    public Student(int rollno, String name, String email, String address) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Copy constructor (Object cloning)
    public Student(Student s) {
        this.rollno = s.rollno;
        this.name = s.name;
        this.email = s.email;
        this.address = s.address;
    }

    // Setter and Getter Methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // Method to input data from the user
    public void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        rollno = in.nextInt();
        in.nextLine(); // Consume newline
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter email: ");
        email = in.nextLine();
        System.out.print("Enter address: ");
        address = in.nextLine();
    }

    // Method to display student data
    public void showData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}

public class Driver {
    public static void main(String[] args) {
        // Array to store 5 Student objects
        Student[] students = new Student[5];

        // Input data for each student and store them in the array
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();  // Create a new Student object
            System.out.println("Enter details for Student " + (i + 1));
            students[i].inputData();  // Get student data from user
        }

        // Display data for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + " Information:");
            students[i].showData();  // Show student data
            System.out.println();
        }
    }
}
