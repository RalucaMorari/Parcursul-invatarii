package PRINCIPIILE.OOP.EX3.AnimalShelter;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Pisi", 12);
        Dog dog = new Dog ("Azor", 15);
        Dog securityDog = new SecurityDog("Boss", 5);
        cat.makeSound();
        dog.makeSound();
        securityDog.makeSound();

        Shelter shelter = new Shelter(10);
        shelter.addAnimal(cat);
        shelter.addAnimal(dog);
        shelter.addAnimal(securityDog);
        shelter.makeNoise();
    }

    }

