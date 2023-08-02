package TEMEIF;

import java.util.Scanner;

public class EX7IF {
    public static void main(String[] args) {
        /*7. Ai o aplicatie de bilete la cinema si vrei sa determini pretul unui bilet.
        Pretul normal este de 10 lei.
        Daca persoana este copil (are varsta mai mica decat 12 ani),
        sau pensionar (mai mult de 65 de ani), atunci pretul este de 5 lei.
        In plus, in fiecare marti, este un discount de 2 lei pentru toata lumea.
        Citeste de la tastatura varsta persoanei si ziua din saptamana, apoi afiseaza in consola pretul biletului.*/

        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = scanner.nextInt();
        int initialPrice = 10;

        int price = initialPrice - getAgeDiscount(age) - getDayDiscount(day);
        System.out.println(price);
    }

    public static int getAgeDiscount(int age) {
        int ageDiscount = 0;
        if (age >= 65 || age <= 12) {
            ageDiscount = 5;
        }
        return ageDiscount;
    }

    public static int getDayDiscount(String day) {
        if (day.equals("marti")) {
            return 2;
        }
        return 0;

    }
}
