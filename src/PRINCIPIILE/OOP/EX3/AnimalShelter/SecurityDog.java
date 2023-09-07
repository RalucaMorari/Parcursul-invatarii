package PRINCIPIILE.OOP.EX3.AnimalShelter;

import static TEMEMETODS.Methods.getName;

public class SecurityDog extends Dog {
    public SecurityDog (String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cainele " + this.getName() + " latra agresiv.");
    }
}
