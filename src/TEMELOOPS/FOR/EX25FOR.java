package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX25FOR {
    public static void main(String[] args) {
        //25. Scrie un program care calculeaza x la puterea y, unde x si y sunt citite de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int multiply = 1;

        for (int i = 0; i < y; i++) {
            multiply = multiply * x;
        }
        System.out.println(multiply);
    }
}
