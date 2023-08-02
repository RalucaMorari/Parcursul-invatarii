package TEMEIF;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EX12IF {
    public static void main(String[] args) {
        /*12. Citeste de la tastatura doua numere, guess si answer si creeaza un joc de ghicit:
daca raspunsul este mai mic decat solutia (adica valoarea variabilei guess, afiseaza “nu ai ghicit, numarul este prea mic”
daca raspunsul este mai mare decat solutia, afiseaza “nu ai ghicit, numarul este prea mare”
daca raspunsul este egal cu solutia, afiseaza “ai ghicit” De exemplu, pentru valorile initiale:
int guess = 7
int answer = 8
se va afisa in consola: "nu ai ghicit, numarul este prea mare"*/
        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();
        int answer = scanner.nextInt();
         if(answer < guess){
             System.out.println("Nu ai ghicit, numarul este prea mic.");
         }else if(answer >guess){
             System.out.println("Nu ai ghicit, numarul este prea mare.");
        }else {
             System.out.println("Ai ghicit!");
         }
    }
}
