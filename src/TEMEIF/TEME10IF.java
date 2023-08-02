package TEMEIF;

import java.util.Scanner;

public class TEME10IF {
    public static void main(String[] args) {
        //10. Citeste 3 numere de la tastatura si scrie un program care sa printeze in consola:
        //“toate numerele sunt egale”, daca toate numerele sunt egale
        //“toate numerele sunt diferite”, daca toate numerele sunt diferite
        //“cel putin doua sunt egale”, daca oricare doua numere dintre cele trei sunt egale De exemplu, pentru valorile initiale:
        //int a = 3
        //int b = 3
        //int c = 4
        //se va afisa in consola: "cel putin doua sunt egale"

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c && a == c) {
            System.out.println("toate numerele sunt egale");
        } else if (a == b || a == c || b == c) {
            System.out.println("cel putin doua sunt egale");
        } else {
            System.out.println("toate numerele sunt diferite");
        }

    }
}
