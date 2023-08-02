package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX7LOOPS {
    public static void main(String[] args) {
        //7. Scrie un program care sa calculeze suma cifrelor unui numar, numarul fiind citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int uc = 0;
        int sum = 0;

        while (n > 0) {
            uc = n % 10;
            sum = sum + uc;
            n = n / 10;
        }
        System.out.println(sum);
    }


}

