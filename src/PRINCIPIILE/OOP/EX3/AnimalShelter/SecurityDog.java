package PRINCIPIILE.OOP.EX3;

import static TEMEMETODS.Methods.getName;

public class SecurityDog extends PRINCIPIILE.OOP.EX3.Dog {
    public SecurityDog (String name, int age){
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cainele " + getName() + " latra agresiv.");
    }
}
