import java.util.Scanner;

class Employee {
    private String name;
    private String email;
    private double salary;
    private String companyName;

    public Employee(String n, String e, String s, String c) {
        name = n;
        email = e;
        salary = Double.parseDouble(s);
        companyName = c;
    }

    public void displayInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName);
    }
}

public class EmployeeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        String salary = scanner.nextLine();
        
        System.out.print("Enter Company Name: ");
        String companyName = scanner.nextLine();
        
        Employee employee = new Employee(name, email, salary, companyName);
        employee.displayInfo();
        
        scanner.close();
    }
}
