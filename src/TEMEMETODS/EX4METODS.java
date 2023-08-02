package TEMEMETODS;

import java.util.Scanner;

public class EX4METODS {
    public static void main(String[] args) {
        /*4. Scrie un program care sa construiasca o adresa de e-mail.
        Citeste de la tastatura numele si domeniul.
Defineste o metoda. De exemplu, pentru numele "stefan.olimpiu" si domeniul "gmail", metoda va returna "stefan.olimpiu@gmail.com"*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numele");
        String name = scanner.nextLine();
        System.out.println("Domeniul");
        String domain = scanner.nextLine();
        String email = createadress(name, domain);
        System.out.println(email);

    }
            public static String createadress(String name, String domain){
        String result = name + "@" + domain;
        return result;


            }


    }

