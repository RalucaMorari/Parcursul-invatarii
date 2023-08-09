package TEMELOOPS.WHILE;

import java.util.Random;
import java.util.Scanner;

public class EX13LOOP2 {
    public static void main(String[] args) {
        //13. Creeaza un guessing game.
        //Programul tau trebuie sa genereze un numar random (intre 1 si 100), iar apoi sa ii ceara utilizatorului sa il ghiceasca.
        //
        //Daca numarul dat de utilizator este mai mic decat numarul generat,
        // atunci afiseaza mesajul "Prea mic, mai incearca"
        // si da-i posibilitatea utilizatorului sa introduca un nou numar.

        //Daca numarul dat de utilizator este mai mare decat numarul generat,
        // atunci afiseaza mesajul "Prea mare, mai incearca"
        // si da-i posibilitatea utilizatorului sa introduca un nou numar.

        //Daca numarul dat de utilizator este egal cu numarul generat, atunci afiseaza mesajul "Ai ghicit".\
        //Pentru a genera un numar random intre 1 si 100, si a-l introduce intr-o variabila, foloseste:
        //
        //int numberToGuess = random.nextInt(100) + 1;
        //HINT: s-ar putea ca "do while" sa se potriveasca mai bine aici.
        //
        //Imbunatateste apoi programul dandu-i posibilitatea utilizatorului sa faca maxim 5 incercari.
        //Daca ghiceste numarul din maxim 5 incercari, afiseaza in consola si din cate incercari a reusit.
        //Altfel, afiseaza in consola faptul ca nu a reusit sa ghiceasca si ca jocul s-a terminat.\

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100 + 1);
        int playerNumber = 0;
        int numberOfTries = 0;

        while (numberOfTries < 7 ){
            playerNumber = scanner.nextInt();
            numberOfTries++;
            if(numberToGuess == playerNumber){
                System.out.println("Ai ghicit din " + numberOfTries + " incercari.");
                break;
            } else if(numberToGuess > playerNumber) {
               System.out.println("Prea mic, mai incearca");
            } else {
                System.out.println("Prea mare, mai incearca");
            }
        }
        if (numberOfTries == 5){
            System.out.println("Jocul s-a terminat.");
        }

    }
}

