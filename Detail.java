import java.util.Scanner;  

class UserInput {
    String name;
    int age;

    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        scanner.close(); 
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class Detail {
    public static void main(String[] args) {
    
        UserInput user = new UserInput();
        user.getInput();
        System.out.println("\nUser Details:");
        user.display();
    }
}
