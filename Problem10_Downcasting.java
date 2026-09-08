class Animal {

    void eat() {

        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {

    void bark() {

        System.out.println("Dog is barking");
    }
}


public class Problem10_Downcasting {

    public static void main(String[] args) {

        Animal animal = new Dog();

        if (animal instanceof Dog) {

            Dog dog = (Dog) animal;

            System.out.println("Downcasting successful");

            dog.bark();
        }
    }
}