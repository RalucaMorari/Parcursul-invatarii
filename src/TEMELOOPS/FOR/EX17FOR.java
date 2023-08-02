package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX17FOR {
    public static void main(String[] args) {
        //17. Scrie un program care sa afiseze numerele de la 1 la n, n fiind citit de la tastatura.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }

    }
}
