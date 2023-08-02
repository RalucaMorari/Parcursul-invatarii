package TEMEIF;

import java.util.Scanner;

public class EX3IF {
    public static void main(String[] args) {
        //3.[LIVE] Citeste de la tastatura un caracter
        // care reprezinta da sau nu.
        // In functie de acest input, afiseaza in consola “de acord”
        // sau “nu sunt de acord”.
        //De exemplu, pentru:
        //
        //char c = ‘y’
        //Se va afisa in consola “de acord”

        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);

        if (c == 'x') {
            System.out.println("de acord");
        }
        if (c == 'y') {
            System.out.println("nu sunt de acord");
        }

        }
    }
