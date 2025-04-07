class StudentGrade {
    String studentName;
    double marks;

    void checkgarde(double marks, String studentName) {
        System.out.print("Your name is " + studentName + ". Your Grade is ");
        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks >= 70 && marks < 90) {
            System.out.println("B");
        } else if (marks >= 50 && marks < 70) {
            System.out.println("C");
        } else if (marks >= 0 && marks < 50) {
            System.out.println("F");
        } else {
            System.out.println("Invalid option");
        }
    }
}

public class Grading {
    public static void main(String[] args) {
        StudentGrade g = new StudentGrade();
        g.checkgarde(111.99999, "Araf");
    }
}
