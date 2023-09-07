package PRINCIPIILE.OOP.EX3.AnimalShelter;

public abstract class Animal {
//    name
//age
//Metode:
//
//Metoda abstractă makeSound()

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();
}
