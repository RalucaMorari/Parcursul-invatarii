package ARRAYS;

import java.sql.SQLOutput;

public class EX2ARRAYS {
    public static void main(String[] args) {
        //2. Scrie un program care sa adune toate preturile dintr-o lista (ca mai apoi sa fie afisata suma totala in cosul de cumparaturi):
        //De exemplu, pentru {1, 7, 3, 10, 9}, se va afisa in consola valoarea 30.
        int [] price = new int [7] ;
        int sum = 0;
        for (int i = 0; i< price.length; i++){
            sum+= price [i];
        }
        System.out.println(sum);

    }
}
