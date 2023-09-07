package PRINCIPIILE.OOP.EX3.AnimalShelter;

public class Dog extends Animal {
    public Dog (String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("Cainele " + this.getName() + " latra.");
    }
}
