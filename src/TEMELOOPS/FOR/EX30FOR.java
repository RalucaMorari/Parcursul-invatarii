package TEMELOOPS.FOR;

public class EX30FOR {
    public static void main(String[] args) {
        //30. Printeaza o piramida, in functie de un numar n citit de la tastatura.
        //De exemplu, pentru n = 5, se va printa:
        //
        //    #
        //   # #
        //  # # #
        // # # # #
        //# # # # #

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }
}
