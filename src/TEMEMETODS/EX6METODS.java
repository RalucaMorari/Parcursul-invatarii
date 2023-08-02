package TEMEMETODS;

import java.util.Scanner;

public class EX6METODS {
    public static void main(String[] args) {
        /* 6. Scrie scheletul unui program care sa trimita notificari text sau prin e-mail.
Defineste o metoda cu numele "createNotification",
care sa accepte ca si parametri mesajul notificarii, cine a trimis notificarea, si cine va primi notificare.
Metoda ar trebui sa returneze textul notificarii.
Defineste o metoda cu numele sendNotificationText,
care sa accepte ca si parametri mesajul notificarii, cine a trimis notificarea, si cine va primi notificare.
Metoda ar trebui sa creeze notificarea in functie de parametri,
apoi sa afiseze la consola: "notificarea a fost trimisa prin mesaj", urmat de textul notificarii.
Defineste o metoda cu numele sendNotificationEmail,
care sa accepte ca si parametri mesajul notificarii, cine a trimis notificarea, si cine va primi notificare.
Metoda ar trebui sa creeze notificarea in functie de parametri,
apoi sa afiseze la consola: "notificarea a fost trimisa prin e-mail", urmat de textul notificarii.
Apeleaza apoi metodele sendNotificationText si sendNotificationEmail din metoda main.
Atunci cand le apelezi, paseaza-le ca parametri niste valori citite de la tastatura (mesajele notificarilor, cine le primeste si cine le trimite).*/
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String sender = scanner.nextLine();
        String receiver = scanner.nextLine();
        createNotification (message, sender, receiver);
        sendNotificationText (message, sender, receiver);
        sendNotificationEmail (message, sender, receiver);

    }

    public static String createNotification (String message, String sender, String receiver){
        return message + "de la" + sender + "pentru" + receiver;

    }

    public static void sendNotificationText(String message, String sender, String receiver){
        System.out.println("notificarea a fost trimisa prin mesaj" + createNotification(message, sender, receiver));
    }

    public static void sendNotificationEmail(String message, String sender, String receiver){
        System.out.println("notificarea a fost trimisa prin e-mail" +  createNotification(message, sender, receiver));

    }
}
