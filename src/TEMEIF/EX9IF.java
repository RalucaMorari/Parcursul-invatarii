package TEMEIF;

import java.util.Scanner;

public class EX9IF {
    public static void main(String[] args) {
        //9. Citeste de la tastatura un numar
        // si afiseaza in consola “fizz”
        // daca numarul este multimplu de 3,
        // “buzz” daca numarul este multiplu de 5
        // si “fizzbuzz” daca numarul este divizibil atat cu 3 cat si cu 5
        //De exemplu, pentru valoarea citita:
        //
        //int number = 15
        //se va afisa in consola "fizzbuzz", pentru ca 15 se imparte exact atat la 5, cat si la 3 iar pentru:
        //
        //int number = 9
        //se va afisa in consola "fizz", pentru ca 9 se imparte exact doar la 3

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        getDivided(number);
        System.out.println(getDivided(number));


//        if ((number % 3 == 0) && (number % 5 == 0)) {
//            System.out.println("fizzbuzz");
//        } else if (number % 3 == 0) {
//            System.out.println("fizz");
//        } else if (number % 5 == 0) {
//            System.out.println("buzz");
//        }
//
     }
    public static String getDivided( int number){
        String result = "";
        if ((number % 3 == 0) && (number % 5 == 0)) {
            result = "fizzbuzz";

        } else if (number % 3 == 0) {
            result = "fizz";

        } else if (number % 5 == 0) {
            result = "buzz";
        }
        return result;
    }
}

