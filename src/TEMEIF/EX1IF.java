package TEMEIF;

import java.util.Scanner;

public class EX1IF {
    public static void main(String[] args) {
        //1. [LIVE] Citeste de la tastatura doua numere si afiseaza-l la consola pe cel mai mare dintre ele.
        //De exemplu, pentru valorie initiale:
        //
        //int a = 13;
        //int b = 14;
        //programul ar trebui sa afiseze in consola valoarea 14
        //
        //HINT1: poti afisa valoarea impreuna cu un mesaj corespunzator folosind operatorul "+". de exemplu, linia de cod:
        //
        // System.out.println("numarul mai mai mare este " + b)
        //va afisa in consola textul "numarul mai mare este 14",
        // pentru ca Java concateneaza valoarea 14 cu String-ul "numarul mai mare este",
        // rezultand un nou String HINT2:
        // Ar putea exista cazuri la care nu ne-am gandit?
        // Daca da, trateaza-le.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Numarul mai mare este " + a);
        } else if (a < b) {
            System.out.println("Numarul mai mic este " + a);
        } else {
            System.out.println("Numerele sunt egale.");
        }

    }
}

