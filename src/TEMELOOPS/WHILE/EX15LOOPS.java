package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX15LOOPS {
    public static void main(String[] args) {
        //15. Creeaza un automat de Coca Cola.
        //Presupunem ca o masina vinde sticle de cola
        // care costa 50 de centi si
        // accepta doar urmatoarele monede: 25 de centi, 10 centi si 5 centi.
        //Implementeaza un program care ii cere utilizatorului
        // sa introduca cate o moneda pe rand,
        // si de fiecare data il informeaza cat mai are de platit pana la cei 50 de centi.
        //O data ce utilizatorul a introdus minim 50 de centi,
        // afiseaza cati centi trebuie sa primeasca rest.
        //Ca si simulam introducerea monedelor,
        // vom citi de la tastatura numere reprezetand valoarea monedelor.\

        Scanner scanner = new Scanner(System.in);
        int a = 25;
        int b = 10;
        int c = 5;
        int correctPrice = 50;
        int tries = 0;
        int currentsum = 0;
        int difference = 0;
        int rest = 0;
        // introduce o moneda: 10, mai ai 40 de centi
        // mai ntroduce o moneda - 25, mai ai 15 centi
        // mai introduce o moneda - 25, rest 10 centi
        // suma maxima cea mai apropiata = 25+10+10=25 = 70

        while (currentsum < 70){
            System.out.println("Introduceti o moneda.");
            currentsum += scanner.nextInt();
            tries ++;
            if (currentsum == 50){
                System.out.println("Ridicati sticla de Coca Cola.");
                break;
            }
            else if(currentsum < 50){
                difference = correctPrice - currentsum;
                System.out.println("Mai aveti de platit " + difference + " centi.");
            }
            else{
                rest = currentsum - correctPrice;
                System.out.println("Ridicati sticla de Coca Cola.");
                System.out.println("Ridicati restul de " + rest + " centi.");
            }
        }

    }
}
