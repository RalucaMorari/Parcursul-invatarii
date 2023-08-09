package ALGORITM;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class EX2ALGORITM {
    public static void main(String[] args) {
        //2. Implementeaza jocul "piatra-foarfece-hartie".
        //Utilizatorul are la dispozitie alegerile "piatra", "foarfece", sau "hartie".
        // Alegerea utilizatorului va fi citita de la tastatura.
        // Alegerea calculatorului va fi generata random.
        // Daca alegerile sunt egale, atunci se va afisa "remiza".
        // Daca utilizatorul alege piatra si calculatorul foarfeca,
        // sau utilizatorul foarfeca si calculatorul hartie,
        // sau utilizatorul hartie si calculatorul piatra, atunci utilizatorul castiga. Daca este fix invers, atunci calculatorul castiga.
        //
        //Implementeaza apoi versiunea jocului in care se alege cel mai bun jucator din 3 runde de joc.


        System.out.println("Alege din cele trei variante:" +
                " 1 - hartie" +
                " 2 - foarfece" +
                " 3 - piatra");
        Scanner scanner = new Scanner(System.in);
//        if(isOptionValid(scanner))
        int userOption = scanner.nextInt();
        if(isOptionValid(userOption))
        {
            Random random = new Random();
            int calculatorOption = random.nextInt(3);
            System.out.println(calculatorOption);


            if (userOption == calculatorOption) {
                System.out.println("remiza");

            } else if ((userOption == 3 && calculatorOption == 2) || (userOption == 2 && calculatorOption == 1) || (userOption == 1 && calculatorOption == 3)) {
                System.out.println("Ai castigat!");
            } else if ((userOption == 2 && calculatorOption == 3) || (userOption == 1 && calculatorOption == 2) || (userOption == 3 && calculatorOption == 1)) {
                System.out.println("Calculatorul a castigat.");
            }
        }

//        while (userOption > 3 || userOption < 1) {
//            System.out.println("Introdu o alta alegere");
//            break;
//        }
    }

    public static boolean isOptionValid(int userOption) {
        //Scanner scanner = new Scanner(System.in);

        if (userOption <= 3 || userOption >= 1) {
            //userOption = scanner.nextInt();
           return true;
        }
        return false;
    }
}
