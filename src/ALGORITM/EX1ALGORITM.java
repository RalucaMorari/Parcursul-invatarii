package ALGORITM;

import java.util.Scanner;

public class EX1ALGORITM {
    public static void main(String[] args) {
        //Avem un gard format din n scanduri, n fiind citit de la tastatura. n trebuie sa fie minim 3.
        //
        //Un copil vopseste cu culoarea rosie din 2 in 2 scanduri
        // (prima scandura colorata cu rosu este scandura 2),
        // iar alt copil vopseste cu culoarea albastra din 3 in 3 scanduri
        // (prima scandura colorata cu albastru este scandura 3).
        // Scandura 1 ramane nevopsita.
        //
        //Exista posibilitatea ca o scandura sa fie violet,
        // atunci cand cand ambii copii o vopsesc
        // (de exemplu, scandura 6 va fi vopsita de ambii copii).
        //
        //Calculeaza (din cele n scanduri) cate scanduri vopsite cu albastru vor fi,
        // cate scanduri vopsite cu rosu vor fi,
        // cate scanduri vopsite cu violet vor fi, si cate scanduri nevopsite vor fi.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int purple = 0;
        int blue = 0;
        int red = 0;
        int uncolored = 0;
        while (n < 3) {
            System.out.println("Introdu un numar mai mare.");
            break;
        }

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                purple++;
            }
            else if (i % 2 == 0) {
                red++;
            }
            else if (i % 3 == 0) {
                blue++;
            }
            else {
                uncolored++;
            }

        }
        System.out.println("Sunt " + red + " scanduri rosii.");
        System.out.println("Sunt " + blue + " scanduri albastre.");
        System.out.println("Sunt " + purple + " scanduri violet.");
        System.out.println("Sunt " + uncolored + " scanduri nevopsite.");
    }
}
