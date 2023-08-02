package TEMELOOPS.WHILE;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class EX2LOOPS {
    public static void main(String[] args) {
        //2. Scrie un program care afiseaza suma numerelor de la 1 la n, n fiind citit de la tastatura

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println(sum);
    }
}
