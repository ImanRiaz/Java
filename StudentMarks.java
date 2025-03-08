import java.util.Scanner;

class Student {
    private String name;
    private int marks1, marks2, marks3;
    private float percentage;

    // Constructor to initialize student details
    public Student(String name, int m1, int m2, int m3) {
        this.name = name;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        calculatePercentage(); // Calculate percentage at initialization
    }

    // Private method to calculate percentage
    private void calculatePercentage() {
        int totalMarks = marks1 + marks2 + marks3; // Temporary variable for total marks
        this.percentage = totalMarks / 3.0f; // Calculate percentage
    }

    // Getter methods to access private variables
    public String getName() {
        return name;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public float getPercentage() {
        return percentage;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + getName());
        System.out.println("Marks: " + getMarks1() + ", " + getMarks2() + ", " + getMarks3());
        System.out.println("Percentage: " + getPercentage() + "%");
        System.out.println("----------------------");
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 3 students
        Student[] students = new Student[3];

        // Taking input for 3 students
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Marks in Subject 1: ");
            int m1 = scanner.nextInt();
            System.out.print("Enter Marks in Subject 2: ");
            int m2 = scanner.nextInt();
            System.out.print("Enter Marks in Subject 3: ");
            int m3 = scanner.nextInt();

            // Creating Student object and storing it in the array
            students[i] = new Student(name, m1, m2, m3);
        }

        scanner.close();

        // Displaying results
        System.out.println("\nStudent Details with Percentage:");
        for (Student s : students) {
            s.display();
        }
    }
}
