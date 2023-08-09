package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX28FOR {
    public static void main(String[] args) {
        //28. Printeaza cealalta jumatate de piramida, in functie de un numar n citit de la tastatura.
        //De exemplu, pentru n = 5, se va printa:
        //
        //       #
        //      ##
        //     ###
        //    ####
        //   #####

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("#");
            }
            System.out.println("#");

        }
    }
}
