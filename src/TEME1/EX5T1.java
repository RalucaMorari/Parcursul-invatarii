package TEME1;

import java.util.Scanner;

public class EX5T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = "user";
        System.out.println("introdu userul");
        String inputUsername = scanner.nextLine();
        String password = "pass";
        System.out.println("introdu parola");
        String inputPassword = scanner.nextLine();
        boolean isUserLoggedIn = inputUsername.equals(username) && inputPassword.equals(password);
        System.out.println(isUserLoggedIn);



    }
}
