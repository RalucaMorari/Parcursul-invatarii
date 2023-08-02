package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX4LOOPS {
    public static void main(String[] args) {
        //4. Scrie un program care afiseaza suma numerelor
        // divizibile cu 3 din intervalul [1-n],
        // n fiind citit de la tastatura.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int sumNo = 0;

        /*
        int i=0;
        for(;i<10;)
        {
        }
         */

        while (i <= n){
            if(n >= 0 && i % 3 == 0){
                sumNo = sumNo + i;
            }
            i++;
        }
        System.out.println(sumNo);
    }
}
