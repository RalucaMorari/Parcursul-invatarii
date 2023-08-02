package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX14LOOPS {
    public static void main(String[] args) {
        //14. Creeaza un sistem de verificare a PIN-ului.
        //Defineste in cadrul programului o variabila care sa contina un PIN, format din 4 cifre, care va reprezenta PIN-ul corect.
        //Un utilizator are maxim 3 incercari sa introduca de la tastatura PIN-ul corect.
        //Daca reuseste sa faca asta, se va afisa in consola "PIN corect" si programul se va opri.
        //Daca nu reuseste sa faca asta, se va afisa in consola "PIN incorect" si programul se va opri.\

        Scanner scanner = new Scanner(System.in);
        int PIN = 1234;
        int PINinserted = 0;
        int i = 0;

        while (i < 3){
            PINinserted = scanner.nextInt();
            if( PIN == PINinserted ) {
                System.out.println("PIN corect");
                break;
            }
            else{
                System.out.println("PIN incorect");
            }
            i++;
       if (i == 3){
           System.out.println("Card blocat.");
       }

        }

    }
}
