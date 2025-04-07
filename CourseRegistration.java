/*Create a class Course with private fields course name, instructor,
 and enrolled student count. Provide methods to add a student, 
 drop a student, and show course details. Use encapsulation and
  validation (e.g., student count cannot be negative). */


  class Course {
    private String courseName;
    private String instructor;
    private int studentCount;

    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.studentCount = 0; // Default to 0 students enrolled
    }

    // Method to add a student
    public void addStudent() {
        studentCount++;
        System.out.println("A student has been added. Total students: " + studentCount);
    }

    // Method to drop a student
    public void dropStudent() {
        if (studentCount > 0) {
            studentCount--;
            System.out.println("A student has been dropped. Total students: " + studentCount);
        } else {
            System.out.println("No students to drop. Student count remains at 0.");
        }
    }

    // Method to show course details
    public void showDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled Students: " + studentCount);
    }

    // Getters if needed (not required but good practice)
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getStudentCount() {
        return studentCount;
    }

    // Main method to test
    public static void main(String[] args) {
        Course course = new Course("Object-Oriented Programming", "Dr. Smith");

        course.showDetails();
        System.out.println();

        course.addStudent();
        course.addStudent();
        course.dropStudent();
        course.dropStudent();
        course.dropStudent(); // Try to drop below 0

        System.out.println();
        course.showDetails();
    }
}
