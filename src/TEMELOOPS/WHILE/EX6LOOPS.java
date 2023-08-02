package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX6LOOPS {
    public static void main(String[] args) {
        //6. Scrie un program care calculeaza factorialul unui numar n, n fiind citit de la tastatura
        //De exemplu, factorialul numarului 3 este 1 * 2 * 3 = 6
        //Factorialul numarului 4 este 1 * 2 * 3 * 4 = 24
        //Factorialul numarului 5 este 1 * 2 * 3 * 4 * 5 = 120
        //Practic trebuie inmultite toate numerele consecutive pana la numarul citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int fact = 1;

        while (i <= n && n >+ 1) {

                fact = fact * i;
                i++;
            }
        System.out.println(fact);
    }
}
