package PRINCIPIILE.OOP.EX3;

import static TEMEMETODS.Methods.getName;

public class Cat extends Animal {
//Clasa Cat (extinde Animal)
//Atribute: niciun atribut nou
//
//Metoda makeSound():
//
//Va afișa un mesaj ca de exemplu: “Pisica Tom face miau”


    public Cat(String name, int age) {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Pisica " + getName() + " face miau.");
    }
}
