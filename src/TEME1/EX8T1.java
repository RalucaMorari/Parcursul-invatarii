package TEME1;

import java.util.Scanner;

public class EX8T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu daca este imprumutata cartea");
        boolean isBookRented = scanner.nextBoolean();

        System.out.println("introdu daca are carti imprumutate");
        int numberOfRentedBooks = scanner.nextInt();

        System.out.println("introdu daca are datorii");
        boolean hasLateFees = scanner.nextBoolean();

        boolean canRentBook = !isBookRented && numberOfRentedBooks<3 && !hasLateFees;
        System.out.println(canRentBook);


    }

    }
