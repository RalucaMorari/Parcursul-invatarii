package PRINCIPIILE.OOP.EX3;

public class Dog extends PRINCIPIILE.OOP.EX3.Animal {
    public Dog (String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("Cainele " + getName() + " latra.");
    }
}
