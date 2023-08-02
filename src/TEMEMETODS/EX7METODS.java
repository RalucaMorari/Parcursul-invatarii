package TEMEMETODS;

import java.util.Scanner;

public class EX7METODS {
    public static void main(String[] args) {
        /*7. Creaza un sistem de tracking pentru colete.
Un colet poate fi in 4 etape inainte de a ajunge la destinatie: preluare, procesare, trimitere, livrare.
Citeste de la tastatura numarul de identificare al coletului.
Creeaza cate o metoda pentru fiecare dintre etape, care sa returneze un mesaj cu starea pachetului.
De exemplu, metoda pentru etapa de preluare ar putea returna urmatorul mesaj: "Coletul cu numarul 32445 a fost preluat".*/

        Scanner scanner = new Scanner(System.in);
        int idNo = scanner.nextInt();

        String message = "";

        confirmPackage(idNo);
        processPackage(idNo);
        sendPackage(idNo);
        deliverPackage(idNo);
    }


    public static String confirmPackage(int idNo) {
        String message = "";
        return message = "Coletul cu numarul " + idNo + " a fost preluat.";
    }

    public static String processPackage(int idNo) {
        String message = "";
        return message = "Coletul cu numarul " + idNo + " a fost prelucrat.";
    }

    public static String sendPackage(int idNo) {
        String message = "";
        return message = "Coletul cu numarul " + idNo + " a fost trimis.";
    }

    public static String deliverPackage(int idNo) {
        String message = "";
        return message = "Coletul cu numarul " + idNo + " a fost livrat.";
    }

}

