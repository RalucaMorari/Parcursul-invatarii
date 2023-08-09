package ARRAYS;

import java.util.Scanner;

public class EX10ARRAYS {
    public static void main(String[] args) {
        //10. Scrie un program care sa inverseze elementele unui array. Adica vrei ca utilizatorul sa poata vedea o lista de preturi de la coada la cap:
        //De exemplu, pentru {1, 7, 3, 10, 9}, sa va afisa in consola "9, 10, 3, 7, 1"

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        int[] pricesReversed = new int[n];

        for (int i = prices.length-1; i >= 0; i--) {
            pricesReversed[n - i - 1] = prices[i];
        }
        for (int i = 0; i < pricesReversed.length; i++) {
            System.out.print (pricesReversed[i] + " ");
        }
    }
}
