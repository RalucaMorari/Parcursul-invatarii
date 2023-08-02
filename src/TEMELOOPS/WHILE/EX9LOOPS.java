package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX9LOOPS {
    public static void main(String[] args) {
        //9. Scrie un program care afiseaza
        // daca un numar este, sau nu, palindrom,
        // numarul fiind citit de la tastatura.
        //Un numar este palindrom daca ramane la fel atunci cand cifrele ii sunt inversate.
        // De exemplu, numarul 12321 este palindrom deoarece atunci cand e inversat, este tot 12321.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reverse = getReverse(n);
        int lastCipher = 0;

        printPalindrom(n);
    }

    public static int getReverse(int n) {
        int reverse = 0;
        int lastCipher = 0;
        while (n > 0) {
            lastCipher = n % 10;
            reverse = (reverse * 10) + lastCipher;
            n = n / 10;
        }
        return reverse;
    }

    public static void printPalindrom(int n) {
        if (n == getReverse(n)) {
            System.out.println("este palindrom");
        } else {
            System.out.println("nu este palindrom");
        }

    }
}
