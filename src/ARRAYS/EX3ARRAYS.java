package ARRAYS;

import java.util.Scanner;

public class EX3ARRAYS {
    public static void main(String[] args) {
        //3. Scrie un program care sa afiseze de cate ori apare un anumit numar n (citit de la tastatura) intr-un array.
        //De exemplu, pentru {1, 2, 2, 3, 3, 3, 4, 4, 4, 4} si n=3, se va afisa "3 apare de 3 ori".

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            if (i == n){
                System.out.println( 3 + " apare de " + numbers [i] + "ori");
            }
        }
    }
}
