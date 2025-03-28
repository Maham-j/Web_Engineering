import java.util.*;

// Abstract Staff class
abstract class Staff {
    protected String name;
    protected int id;
    protected String department;
    
    public Staff(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    
    public abstract double calculateSalary();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

// Professor class
class Professor extends Staff {
    private double fixedSalary;
    
    public Professor(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }
    
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

// Lecturer class
class Lecturer extends Staff {
    private int lectures;
    private double payPerLecture;
    
    public Lecturer(String name, int id, String department, int lectures, double payPerLecture) {
        super(name, id, department);
        this.lectures = lectures;
        this.payPerLecture = payPerLecture;
    }
    
    @Override
    public double calculateSalary() {
        return lectures * payPerLecture;
    }
}

// Administrator class
class Administrator extends Staff {
    private double baseSalary;
    private double bonus;
    
    public Administrator(String name, int id, String department, double baseSalary, double bonus) {
        super(name, id, department);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Research Assistant class
class ResearchAssistant extends Staff {
    private double stipend;
    private double grant;
    
    public ResearchAssistant(String name, int id, String department, double stipend, double grant) {
        super(name, id, department);
        this.stipend = stipend;
        this.grant = grant;
    }
    
    @Override
    public double calculateSalary() {
        return stipend + grant;
    }
}

// Driver class
public class UniversityPayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of staff members: ");
        int n = sc.nextInt();
        
        Staff[] staffList = new Staff[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Select type: 1. Professor 2. Lecturer 3. Administrator 4. Research Assistant");
            int choice = sc.nextInt();
            
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter Department: ");
            String department = sc.next();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Fixed Salary: ");
                    double salary = sc.nextDouble();
                    staffList[i] = new Professor(name, id, department, salary);
                    break;
                case 2:
                    System.out.print("Enter Number of Lectures: ");
                    int lectures = sc.nextInt();
                    System.out.print("Enter Pay per Lecture: ");
                    double payPerLecture = sc.nextDouble();
                    staffList[i] = new Lecturer(name, id, department, lectures, payPerLecture);
                    break;
                case 3:
                    System.out.print("Enter Base Salary: ");
                    double baseSalary = sc.nextDouble();
                    System.out.print("Enter Bonus: ");
                    double bonus = sc.nextDouble();
                    staffList[i] = new Administrator(name, id, department, baseSalary, bonus);
                    break;
                case 4:
                    System.out.print("Enter Stipend: ");
                    double stipend = sc.nextDouble();
                    System.out.print("Enter Research Grant: ");
                    double grant = sc.nextDouble();
                    staffList[i] = new ResearchAssistant(name, id, department, stipend, grant);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    i--;
            }
        }
        
        System.out.println("\nStaff Salary Details:");
        for (Staff staff : staffList) {
            System.out.println(staff + ", Salary: " + staff.calculateSalary());
        }
        
        sc.close();
    }
}
