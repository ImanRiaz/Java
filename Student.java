/*Create a Person Class

Define a class Person with attributes name and age.

Add a method displayInfo() to print details.

Create two objects and call displayInfo(). */

class Person{
    void displayInfo(String name,int age){
        System.out.println("The name is "+name+". The age is "+age);
    }
}


public class Student {
    public static void main (String [] args){
        Person p=new Person();
        p.displayInfo("Araf", 17);
    }
}
