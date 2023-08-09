package ARRAYS;

public class EX9ARRAYS {
    public static void main(String[] args) {
        //9. Scrie un program care sa afiseze cel mai mare si cel mai mic pret dintr-o lista de preturi.
        //De exemplu, pentru {1, 7, 3, 10, 9}, se vor afisa in consola valorile 1 si 10

        int[] prices = {8, 10, 2, 7, 1, 19};
        int min = prices[0];
        int max = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }

        }
        System.out.println(min);
        System.out.println(max);


    }
}
