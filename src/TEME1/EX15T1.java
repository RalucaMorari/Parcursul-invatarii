package TEME1;

import java.util.Scanner;

public class EX15T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("isEmployee");
        boolean isEmployee = scanner.nextBoolean();
        System.out.println("isContractor");
        boolean isContractor = scanner.nextBoolean();
        System.out.println("isBadgeActive");
        boolean isBadgeActive = scanner.nextBoolean();
        System.out.println("isContractExpired");
        boolean isContractExpired = scanner.nextBoolean();
        System.out.println("isMaintenanceHour");
        boolean isMaintenanceHour = scanner.nextBoolean();

        boolean canAccessNetwork = isBadgeActive && (isEmployee || (isContractor && !isContractExpired)) && !isMaintenanceHour;
        System.out.println(canAccessNetwork);

    }
}
