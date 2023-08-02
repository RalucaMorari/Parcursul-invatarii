package TEMEIF;

import java.util.Scanner;

public class EX5IF {
    public static void main(String[] args) {
        /* 5.Construieste un calculator de baza.
Citeste de la tastatura 2 numere si
un caracter care reprezinta operatia pe care vrei sa o realizezi: +, -, * sau /.
Apoi afiseaza rezultatul calculului respectiv in consola. Ai grija sa tratezi cazul in care se face impartire la 0.
         */

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        char op = scanner.next().charAt(0);

        if(y==0){
            System.out.println("Nu se poate imparti la 0");
        } else if( op == '+'){
            System.out.println(x + y);
        } else if (op == '-'){
            System.out.println(x - y);
        }else if (op == '*') {
            System.out.println(x * y);
        }else if(op == '/'){
            System.out.println(x/y);
        }
    }
}
