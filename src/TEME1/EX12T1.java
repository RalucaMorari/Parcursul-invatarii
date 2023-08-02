package TEME1;

import java.util.Scanner;

public class EX12T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu nivelul combustibilului");
        double fuelLevel = scanner.nextDouble();
        System.out.println("introdu daca sistemele verificate functioneaza");
        boolean isSystemsCheckPassed = scanner.nextBoolean();
        System.out.println("introdu daca vremea este buna");
        boolean isWeatherClear = scanner.nextBoolean();
        System.out.println("introdu daca sunt oameni la bord");
        boolean hasLivingCreaturesInCargo = scanner.nextBoolean();
        System.out.println("introdu daca este o misiune de salvare");
        boolean isRescueMission = scanner.nextBoolean();
        boolean canTakeOff1 = fuelLevel>1/2 && isSystemsCheckPassed && isWeatherClear;
        System.out.println(canTakeOff1);
        boolean canTakeOff2 = canTakeOff1 && !hasLivingCreaturesInCargo;
        System.out.println(canTakeOff2);

        boolean canTakeOff = canTakeOff2 || (canTakeOff1 && isRescueMission);
        System.out.println(canTakeOff);


    }
}
