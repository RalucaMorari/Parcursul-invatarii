package PRINCIPIILE.OOP.EX3.AnimalShelter;

public class Shelter {

    private Animal[] animals;
    private int numberOfAnimals;

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public Shelter(int size) {
        this.animals = new Animal[size];
        numberOfAnimals = 0;
    }

    public void makeNoise() {
        for (int i = 0; i < numberOfAnimals; i++) {
            animals[i].makeSound();
        }
    }

    //Atribute:
    //
    //animals (adică o listă de animale)
    //Metode:
    //
    //makeNoise():
    //
    //Această metodă va face ca toate animalele din listă să scoată sunet
    //addAnimal():
    //
    //Această metodă va adăuga un animal în lista de animale
    //main():
    //
    //În această metodă se vor adăuga animale în lista folosind metoda addAnimal()
    //Apoi se va apela metoda makeNoise() pentru ca fiecare animal din listă să facă sunetul corespunzător (de câine sau de pisică, după caz)



    public void addAnimal(Animal animal) {
        animals[numberOfAnimals] = animal;
        numberOfAnimals++;
    }



}

