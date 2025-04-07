/*Create an Animal Class

Define a class Animal with attributes species and sound.

Implement a method makeSound() to print the animal's sound.

Create two objects and call makeSound(). */

class Animal{
    void makeSound(String species,String sound){
        System.out.println("The name of this specie is "+species+".The sound they make is "+sound+".");
    }
}
public class Sound {
    public static void main(String[] args){
        Animal m=new Animal();
        m.makeSound("Mammals,Cat","meow meow");
        m.makeSound("Aquatic,Dolphin","tiuuuuuu");
    }
}
