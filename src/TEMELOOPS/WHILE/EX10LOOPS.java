package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX10LOOPS {
    public static void main(String[] args) {
        //10. Scrie un program care afiseaza cel mai mare divizor comun al doua numere, citite de la tastatura.
        //De exemplu, pentru numerele 21 si 15, cel mai mare divizor comun este 3.
        //3 este cel mai mare numar la care si 21 si 15 se impart exact.

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cmdc = 0;
        int min = 0;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        while (min >= 1 && cmdc == 0)  {
            if (a % min == 0 && b % min == 0) {
                cmdc = min;
            }
            min--;
        }
        System.out.println(cmdc);
    }
}
