package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX21FOR {
    public static void main(String[] args) {
        //21. Scrie un program care sa faca
        // media tuturor numerelor consecutive de la x la y,
        // unde x si y sunt citite de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double media = 0;
        double sum = 0;

        if (y - x > 0) {
            for (int i = x; i <= y; i++) {
                sum = sum + i;
                media = sum / ((y - x) + 1);
            }

            System.out.println(media);
            } else {
            for (int i = y; i <= x; i++) {
                sum = sum + i;
                media = sum / ((x - y) + 1);
            }
            System.out.println(media);
        }


        }
    }

