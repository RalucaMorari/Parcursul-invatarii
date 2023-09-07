package PRINCIPIILE.OOP.EX3.AnimalShelter;


    public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("Pisica " + this.getName() + " face miau.");
    }
}
