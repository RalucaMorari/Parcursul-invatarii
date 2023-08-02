package TEMELOOPS.WHILE;

import java.util.Scanner;

public class EX12LOOPS {
    public static void main(String[] args) {
        //12. Scrie un program care sa determine in cati ani economiile tale vor creste la target-ul pe care ti l-ai propus.
        //Sa presupunem ca deschizi un cont de economii cu o suma initiala de bani, la care se adauga in fiecare an o dobanda.
        //
        //De exemplu, daca deschizi un cont de 1000 de lei cu o dobanda anuala de 10%, dupa primul an vei avea 1000 + 0.1 * 1000 = 1100 de lei.
        //Apoi, dupa al doilea an vei avea 1100 + 0.1 * 1100 = 1210
        //Si tot asa, in fiecare an.
        //
        //Citeste de la tastatura suma initiala, procentul de dobanda anual, si suma target la care vrei sa ajungi.
        //Apoi calculeaza cati ani e nevoie sa treaca pana ca in cont sa ajungi la suma target.\

        Scanner scanner = new Scanner(System.in);
        String sumaInitiala = "";
        System.out.println("Scrie suma initiala");
        double n = scanner.nextDouble();
        String dobanda = "";
        System.out.println("Scrie dobanda");
        double d = scanner.nextDouble();
        String sumaFinala = "";
        System.out.println("Scrie suma finala");
        double target = scanner.nextDouble();
        int years = 0;
        getInterestRate(n, d);

        while (n <= target){
            n = n + getInterestRate(n, d);
            years++;
        }
        System.out.println(years);

    }

    public static double getInterestRate(double n, double d) {
        d = n * d;
        return d;
    }


}
