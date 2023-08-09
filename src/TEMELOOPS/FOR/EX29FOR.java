package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX29FOR {
    public static void main(String[] args) {
        //29. Printeaza jumatate de piramida rasturnata, in functie de un numar n citit de la tastatura.
        //De exemplu, pentru n = 5, se va printa:
        //
        //#####
        //####
        //###
        //##
        //#

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {

            for (int j = 0; j < i-1; j++) {
                System.out.print("#");
            }
            System.out.println("#");

        }
    }
}
