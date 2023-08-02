package TEMEMETODS;

import java.util.Scanner;

public class EX1TMETODS {
    public static void main(String[] args) {
        //1. Scrie un program care sa citeasca de la tastatura un mesaj, iar apoi sa afiseze mesajul cu litere mari.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesajul tau");
        String answer = scanner.nextLine();
        answer = answer.toUpperCase();
        System.out.println(answer);

    }
}
