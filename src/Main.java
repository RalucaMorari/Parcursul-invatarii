import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String productName = "mustar";
        double price = 2.77;
        boolean isAvailable = true;
        char nutriScore = 'A';
        boolean isBio = false;

        String productName2 = "ketchup";
        double price2 = 65;
        boolean isAvailable2 = false;
        char nutriScore2 = 'A';
        boolean isBio2 = true;


        double totalPrice = price + price2;
        double mediumPrice = totalPrice/2;
        boolean isMediumPriceCorrect = (30 < mediumPrice) && (mediumPrice < 35);
        boolean isMediumPriceCorrect2 = (30 <  mediumPrice) || (mediumPrice < 35);
        System.out.println(totalPrice);
        System.out.println(mediumPrice);

        System.out.println(totalPrice > 70);
        System.out.println(totalPrice >= 70);
        System.out.println(price == price2);

        System.out.println(isBio2 && isBio);

        boolean isMustardCheaper = price < price2;

        boolean isCold = false;
        boolean isDry = true;
        boolean isSummer = false;
        boolean canTrekking = isDry && (!isCold || isSummer);


        String username = "user";
        String password = "pass";
        System.out.println("introdu userul");
        String inputUsername = scanner.nextLine();
        System.out.println("introdu parola");
        String inputPassword = scanner.nextLine();
        boolean isLoggedIn = inputUsername.equals(username) && inputPassword.equals(password);
        System.out.println(isLoggedIn);

    }
}


