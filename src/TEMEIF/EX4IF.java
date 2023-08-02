package TEMEIF;

import java.util.Scanner;

public class EX4IF {
    public static void main(String[] args) {

        //4. Avand la dispozitie o variabila care stocheaza un numar,
        // afiseaza in consola daca numarul este par sau impar.
        //De exemplu, pentru valoarea initiala:
        //
        //int a = 12
        //se va afisa in consola textul "numarul este par"

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("numarul este par");
        } else {
            System.out.println("numarul este impar");
        }

    }
}
