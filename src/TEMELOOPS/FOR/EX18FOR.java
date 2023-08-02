package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX18FOR {
    public static void main(String[] args) {
        //18. Scrie un program care sa printeze urmatorul pattern, in functie de numar n citit de la tastatura.
        //De exemplu, pentru n = 400 se va afisa:
        //
        //0
        //moo
        //2
        //moo
        //[si tot asa in continuare…]
        //398
        //moo
        //400
        //moo

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;

        for (i = 0; i < n; i++){
            System.out.println(i);
            System.out.println("moo");
        }
    }
}
