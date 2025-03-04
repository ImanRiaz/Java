import java.util.Scanner;

class Calculate{
    int add(int a,int b){
    return a+b;
    }

    int subtract(int a,int b){
     return a-b;
    }

    int multiply(int a,int b){
       return a*b;
    }

    int divide(int a,int b){
     return a/b;
    }

}
public class Claculator1 {
   public static void main(String[] args){
    Scanner choose=new Scanner(System.in);
Calculate c=new Calculate();
int choice;
do{
System.out.println("MENU");
System.out.println("1-Add");
System.out.println("2-Subtract");
System.out.println("3-Multiply");
System.out.println("4-Divide");
System.out.println("Enter 5 to exit.");
System.out.println("Enter your choice:");
 choice=choose.nextInt();
System.out.println("Enter two number you want to perform the function on: ");
System.out.println("Number 1: ");
int num1=choose.nextInt();
System.out.println("Number 2: ");
int num2=choose.nextInt();

switch (choice) {
    case 1:
        System.out.println("The sum of " +num1+" and "+num2+" is "+c.add(num1, num2));
        break;
    case 2:
       System.out.println("The subtration of "+num1+" and "+num2+" is "+c.subtract(num1,num2));
         break;
    case 3:
    System.out.println("The Multiplication of "+num1+" and "+num2+" is "+ c.multiply(num1,num2));
         break;
    case 4:
    System.out.println("The division of "+num1+" and "+num2+" is "+c.divide(num1,num2));
    break; 
    default:
    System.out.println("Invalid choice");
        break;
}
    
   } while(choice!=5);
}
}
