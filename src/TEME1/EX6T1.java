package TEME1;

import java.util.Scanner;

public class EX6T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introdu daca userul e premium");
        boolean isPremiumMember = scanner.nextBoolean();
        System.out.println("introdu daca userul e cumparator");
        boolean hasBoughtVideo = scanner.nextBoolean();
        System.out.println("introdu daca serverul e online");
        boolean isServerOnline = scanner.nextBoolean();

        boolean canViewVideo = ((isPremiumMember)||(hasBoughtVideo))&&(isServerOnline);
        System.out.println(canViewVideo);







    }
}
