package TEME1;

import java.util.Scanner;

public class EX11T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu punctele");
        int playerPoints = scanner.nextInt();
        System.out.println("introdu daca are o cheie de aur");
        boolean hasGoldenKey= scanner.nextBoolean();
        System.out.println("introdu daca jucatorul este sub atac");
        boolean isUnderAttack = scanner.nextBoolean();
        System.out.println("introdu jocul este pus pe pauza");
        boolean isGamePaused= scanner.nextBoolean();
        System.out.println("introdu daca serverul ruleaza");
        boolean isServerRunning = scanner.nextBoolean();

        boolean canAdvanceLevel1  = (playerPoints>1000 || hasGoldenKey) && !isUnderAttack;
        System.out.println(canAdvanceLevel1);

        boolean canAdvanceLevel2  = canAdvanceLevel1 && !isGamePaused && isServerRunning;
        System.out.println(canAdvanceLevel2);
    }


}
