package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX27FOR {
    public static void main(String[] args) {
        //27. Printeaza aceeasi jumatate de piramida (doar ca acum formata din numere), in functie de un numar n citit de la tastatura.
        //De exemplu, pentru n = 5, se va printa:
        //
        //0
        //01
        //012
        //0123
        //01234

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);

        }
    }
}
