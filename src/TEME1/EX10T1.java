package TEME1;

import java.util.Scanner;

public class EX10T1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("introdu daca este administrator");
        boolean isAdministrator = scanner.nextBoolean();
        System.out.println("introdu daca este manager");
        boolean isManager = scanner.nextBoolean();
        System.out.println("introdu daca este parte din proiect");
        boolean isPartOfProject = scanner.nextBoolean();
        System.out.println("introdu daca are 2FA");
        boolean hasTwoFactorEnabled = scanner.nextBoolean();
        System.out.println("introdu daca este marcat cu activitate suspicioasa");
        boolean isFlaggedSuspicious = scanner.nextBoolean();
        System.out.println("introdu daca serverul este pornit");
        boolean isServerUp = scanner.nextBoolean();

        boolean canAccessPage1 = isAdministrator || (isManager && isPartOfProject);
        System.out.println(canAccessPage1);

        boolean canAccessPage2 = hasTwoFactorEnabled && !isFlaggedSuspicious;
        System.out.println(canAccessPage1);

        boolean canAccesPagefinal = canAccessPage1 && canAccessPage2 && isServerUp;
        System.out.println(canAccesPagefinal);

    }
}
