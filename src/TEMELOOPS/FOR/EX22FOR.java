package TEMELOOPS.FOR;

import java.util.Scanner;

public class EX22FOR {
    public static void main(String[] args) {
        //22. Scrie un program care sa afiseze
        // suma numerelor divizibile cu 3 de la 1 la n,
        // n fiind citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            if(i % 3 == 0){
                sum = sum + i;            }
        }
        System.out.println(sum);
    }
}
