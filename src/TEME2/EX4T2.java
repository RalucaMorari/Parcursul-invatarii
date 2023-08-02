package TEME2;

import java.util.Scanner;

public class EX4T2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele");
        String name = scanner.nextLine();
        System.out.println("Introdu domeniul");
        String domain = scanner.nextLine();

        String getadress = (name + domain);
        System.out.println(getadress);

    }
}




//replace
//toUpperCase
