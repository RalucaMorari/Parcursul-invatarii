package TEMEMETODS;

import java.util.Scanner;

public class EX3METODS {
    public static void main(String[] args) {
        /*3. Scrie un program care sa adauge emoticoane. Citeste de la tastatura un mesaj si inlocuieste toate secventele ":)" cu 🙂 si toate secventele
":(" cu 🙁 De exemplu, pentru mesajul introdus "Hello :) Goodbye :(", se va afisa in consola Hello 🙂 Goodbye 🙁.
Cauta pe Google o metoda deja implementata care sa faca inlocuirea.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("mesajul tau");
        String answer = scanner.nextLine();
        answer = answer.replace(":)","\uD83D\uDE42");
        answer = answer.replace(":(","\uD83D\uDE42");
        System.out.println(answer);


    }
}
