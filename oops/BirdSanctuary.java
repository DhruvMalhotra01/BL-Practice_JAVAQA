package oops;

import java.util.ArrayList;
import java.util.List;


interface Flyable {

    void fly();
}


interface Swimmable {

    void swim();
}


abstract class Bird {

    private String name;

    Bird(String name) {

        this.name = name;
    }


    public String getName() {

        return name;
    }


    void display() {

        System.out.println("Bird: " + name);
    }
}


class Eagle extends Bird implements Flyable {

    Eagle(String name) {

        super(name);
    }


    @Override
    public void fly() {

        System.out.println(getName() + " can fly");
    }
}


class Duck extends Bird implements Flyable, Swimmable {

    Duck(String name) {

        super(name);
    }


    @Override
    public void fly() {

        System.out.println(getName() + " can fly");
    }


    @Override
    public void swim() {

        System.out.println(getName() + " can swim");
    }
}


class Penguin extends Bird implements Swimmable {

    Penguin(String name) {

        super(name);
    }


    @Override
    public void swim() {

        System.out.println(getName() + " can swim");
    }
}


public class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();


    void addBird(Bird bird) {

        birds.add(bird);
    }


    void showAllBirds() {

        System.out.println("\nAll birds:");

        for (Bird bird : birds) {

            bird.display();
        }
    }


    void showFlyingBirds() {

        System.out.println("\nBirds that can fly:");

        for (Bird bird : birds) {

            if (bird instanceof Flyable) {

                System.out.println(bird.getName());
            }
        }
    }


    void showSwimmingBirds() {

        System.out.println("\nBirds that can swim:");

        for (Bird bird : birds) {

            if (bird instanceof Swimmable) {

                System.out.println(bird.getName());
            }
        }
    }


    public static void main(String[] args) {

        BirdSanctuary sanctuary =
                new BirdSanctuary();


        sanctuary.addBird(
                new Eagle("Eagle")
        );

        sanctuary.addBird(
                new Duck("Duck")
        );

        sanctuary.addBird(
                new Penguin("Penguin")
        );


        sanctuary.showAllBirds();

        sanctuary.showFlyingBirds();

        sanctuary.showSwimmingBirds();
    }
}