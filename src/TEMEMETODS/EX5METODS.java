package TEMEMETODS;

import java.util.Scanner;

public class EX5METODS {
    public static void main(String[] args) {
        /*5. Scrie un program care sa verifice daca un cuvant este intr-un text.
                Citeste de la tastatura un String reprezetand un text si cuvantul pe care doresti sa il cauti.
        De exempluu, pentru textul "eu sunt aici" si cuvantul "sunt", metoda va returna true pentru ca a gasit cuvantul "sunt" in text.
        Cauta pe Google o metoda deja implementata care sa faca verificarea pentru tine.*/

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.contains("bine"));

    }
}
