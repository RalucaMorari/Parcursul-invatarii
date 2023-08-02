package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX23FOR {
    public static void main(String[] args) {
        //23. Scrie un program care sa afiseze factorialul unui numar.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 0;

        for (int i = 0; i < n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
