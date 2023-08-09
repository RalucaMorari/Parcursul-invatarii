package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX16LOOPS {
    public static void main(String[] args) {
        //16. Creeaza un sistem automat de dat rest.
        //Atunci cand dai rest pentru un produs,
        // vrei sa minimizezi numarul de monede pe care le dai ca rest.
        //Daca ai de ales ca pentru suma de 50 de centi sa dai rest 2 monede de 25 de centi, sau 5 monede de 10 centi,
        //vei alege prima varianta.
        //Avem la dispozitie monede de 25 centi, 10 centi, 5 centi, 1 cent.
        //Sa luam inca un exemplu:
        //
        //Daca restul este de 41 de centi, vrei sa ii dai o moneda de 25 de centi.
        //Mai raman 16 centi, asa ca ii mai dai o moneda de 10 centi (cea mai mare ca valoare pe care poti sa i-o dai)
        //Mai raman 6 centi, asa ca ii mai dai o moneda de 5 centi
        //Mai ramane 1 cent, asa ca ii mai dai o moneda de 1 cent In total 4 monede.
        //Programul trebuie sa citeasca de la tastatura valoarea restului
        // si sa afiseze de cate monede este nevoie pentru a da rest, respectand algoritmul din exemplu.
        //Programul nu trebuie sa afiseze de cate monede de fiecare tip este nevoie,
        // ci de cate monede in total (chiar daca vor fi monede de tipuri diferite).\
        //
        //HINT: porneste cu un pseudocod, care poate arata asa:
        //
        //// citesc de la tastatura valoarea restului, in centi
        //// calculez cate monede de 25 pot sa ii dau si le adun la numarul total de monede
        //// scad valoarea monedelor de 25 din valoarea restului
        //// calculez cate monede de 10 pot sa ii dau si le adun la numarul total de monede
        //// scad valoarea monedelor de 10 din centii ramasi de dat ca rest
        //// calculez cate monede de 5 pot sa ii dau si le adun la numarul total de monede
        //// scad valoarea monedelor de 5 din centii ramasi de dat ca rest
        //// calculez cate monede de 1 pot sa ii dau si le adun la numarul total de monede
        //// scad valoarea monedelor de 1 din centii ramasi de dat ca rest
        //// afisez numarul total de monede
        //Testeaza codul la final:
        //
        //pentru input -1, programul iti cere sa introduci din nou o valoare?
        //pentru input 0, afiseaza programul 0?
        //pentru input 4, afiseaza programul 4?
        //pentru input 5, afiseaza programul 1?
        //pentru input 24, afiseaza programul 6?
        //pentru input 25, afiseaza programul 1?
        //pentru input 26, afiseaza programul 2?
        //pentru input 99, afiseaza programul 9?

        Scanner scanner = new Scanner(System.in);
        int rest = scanner.nextInt();
        int coin25 = 25;
        int coin10 = 10;
        int coin5 = 5;
        int coin1 = 1;
        int tries = 0;
        int currentRest = rest;
        int numberOfCoins = 0;

        if (rest < 0) {
            System.out.println("Introduceti din nou o valoare.");
        }
        if (currentRest > 0) {
            while (currentRest >= 25) {
                currentRest = currentRest - 25;
                numberOfCoins++;
            }
            while (currentRest >= 10 && currentRest < 25) {
                currentRest = currentRest - 10;
                numberOfCoins++;
            }
            while (currentRest >= 5 && currentRest < 10) {
                currentRest = currentRest - 5;
                numberOfCoins++;
            }
            while (currentRest >= 1 && currentRest < 5) {
                currentRest = currentRest - 1;
                numberOfCoins++;
            }
        }
        System.out.println(numberOfCoins);
    }

}







