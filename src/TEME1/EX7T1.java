package TEME1;

import java.util.Scanner;

public class EX7T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introdu daca are cursuri anterioare");
        boolean HasCompletedPrerequisites = scanner.nextBoolean();
        char gradeInPrerequisites1 = 'A';
        char gradeInPrerequisites2 = 'B';
        System.out.println("introdu daca are media necesara");
        boolean gradeInPrerequisites = scanner.nextBoolean();
        System.out.println("introdu daca sunt locuri libere");
        boolean hasOpenSpots = scanner.nextBoolean();
        boolean canTakeCourse = ((HasCompletedPrerequisites) && (gradeInPrerequisites)) && (hasOpenSpots);
                System.out.println(canTakeCourse);


    }
}
