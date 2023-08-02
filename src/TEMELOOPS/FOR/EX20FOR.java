package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX20FOR {
    public static void main(String[] args) {
        //20. Scrie un program care sa afiseze numerele pare de la 1 la n, n fiind citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

