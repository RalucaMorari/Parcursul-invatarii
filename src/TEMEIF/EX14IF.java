package TEMEIF;

import java.util.Scanner;

public class EX14IF {
    public static void main(String[] args) {
        /*14. Scrie un program care citeste de la tastatura 3 numere,
        reprezentand lugimile laturilor unui triunghi.
Trebuie sa afisezi in consola daca cele 3 laturi formeaza un triunghi valid, sau nu.
Un triunghi este valid daca suma lungimilor oricaror doua laturi este mai mare decat lugimea celei de-a 3-a laturi.*/
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();

        /* x+y>z = A
        x+ z>y = B
        y+z >x = C
        boolean este triunghi = A||B||C
        sout boolean
         */
        if (x + y > z) {
            System.out.println("Este un triunghi.");
        } else if(x + z > y ){
            System.out.println("Este un triunghi.");
        } else if(y + z >x){
            System.out.println("Este un triunghi.");
        } else if (x <= 0) {
            System.out.println("Nu este un triungi.");
        } else if (y <= 0) {
            System.out.println("Nu este un triungi.");
        } else if (z <= 0) {
            System.out.println("Nu este un triungi.");
        }

        }

    }

