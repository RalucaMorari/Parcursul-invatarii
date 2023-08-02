package TEMEIF;

import java.util.Scanner;

public class EX2IF {
    public static void main(String[] args) {

        //2. [LIVE] Produci software pentru un fierbator de apa.
        // Citeste de la tastatura temperatura curenta a apei si:
        //Var1: afiseaza un mesaj corespunzator
        // daca temperatura este mai mare de 100 de grade (apa fierbe)
        //Var2: afiseaza un mesaj corespunzator daca apa fierbe,
        // si un alt mesaj corespunzator in caz contrar
        //Var3: afiseaza un mesaj corespunzator daca temperatura este mai mare de 100 de grade (apa fierbe),
        // un alt mesaj daca temperatura este mai mica decat 50 de grade (apa este in curs de fierbere)
        // si un altul daca apa are temperatura intre 50 si 100 de grade (apa este aproape fiarta)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu temperatura");
        int temperatura = scanner.nextInt();
        if (temperatura >= 100) {
            System.out.println("fierbe apa");
        } else if (temperatura >= 50 && temperatura < 100) {
            System.out.println("aproape fierta");

        } else if (temperatura < 50 && temperatura >= 0) {
            System.out.println("in curs de fierbere");

        } else {
            System.out.println("inghetata");
        }
    }
}
