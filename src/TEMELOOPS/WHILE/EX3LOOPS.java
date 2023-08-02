package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX3LOOPS {
    public static void main(String[] args) {
        //3. Scrie un program care afiseaza numerele pare de la 1 la n.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;

        while(i <= n) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
