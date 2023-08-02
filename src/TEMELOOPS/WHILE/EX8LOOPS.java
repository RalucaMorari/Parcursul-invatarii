package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX8LOOPS {
    public static void main(String[] args) {

        //8. Scrie un program care inverseaza cifrele unui numar,
        // numarul fiind citit de la tastatura.
        //Bazeaza-te pe faptul ca ultima cifra a oricarui numar este, de fapt, restul impartirii acelui numar la 10.
        // In plus, catul impartirii acelui numar la 10 este, de fapt, numarul initial, fara ultima cifra.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int invers = 0;
        int uc = 0;


        while (n > 0) {
           uc = n % 10;
           invers = (invers * 10) + uc;
           n = n / 10;
        }
        System.out.println(invers);
    }
}

