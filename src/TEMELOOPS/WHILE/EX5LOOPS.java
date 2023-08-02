package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX5LOOPS {
    public static void main(String[] args) {
        // 5. Scrie un program care afiseaza numerele din sirul fibonacci pana la maxim n, n fiind citit de la tastatura.
        //Sirul fibonacci are urmatoarea regula:
        // fiecare numar din sir este egal cu suma precedentelor doua numere din sir.
        // Primele doua numere sunt intodeauna 0 si 1.
        //
        //0, 1, 1, 2, 3, 5, 8, 13, 21, ...

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        int i = 0;
        int sum = 0;

        while (i <= n){
            if (n >= 0){
                sum = a + b;
                a = b;
                b = sum;
                System.out.println(b);
            }
            i++;
        }
    }
}
