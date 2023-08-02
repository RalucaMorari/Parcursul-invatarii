package TEME1;

import java.util.Scanner;

public class EX13T1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu daca este disponibila");
        boolean isRoomAvailable = scanner.nextBoolean();
        System.out.println("introdu daca a depasit numarul de rezervari/saptamana");
        boolean isQuotaExceeded = scanner.nextBoolean();

        System.out.println("introdu daca este o camera cu multe locuri");
        boolean isHighCapacityRoom = scanner.nextBoolean();
        System.out.println("introdu numarul de membri");
        int teamSize = scanner.nextInt();

        boolean canBookRoom = (isRoomAvailable && !isQuotaExceeded) && (isHighCapacityRoom && teamSize>10);
        System.out.println(canBookRoom);


    }

}
