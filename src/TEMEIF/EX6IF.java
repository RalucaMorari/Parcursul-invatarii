package TEMEIF;

import java.util.Scanner;

public class EX6IF {
    public static void main(String[] args) {
/*6. Vrei sa determini BMI-ul (Body Mass Index) al unei persoane.
Citeste de la tastatura greutatea si inaltimea unui om.
Apoi calculeaza BMI-ul utilizand formula: “greutate / (inaltime * intaltime)”
Apoi, daca BMI-ul este mai mic decat 18, 5 afiseaza in consola “esti sub greutatea normala”.

Daca BMI-ul este intre 18.5 si 24.9, afiseaza in consola “ai greutatea normala”.
Daca BMI-ul este intre 25 si 29.9, afiseaza in consola “esti peste greutatea normala”.
Daca BMI-ule este mai mare deact 29.9, afiseaza in consola “esti obez”.*/

        Scanner scanner = new Scanner(System.in);
        double greutate = scanner.nextDouble();
        double inaltime = scanner.nextDouble();
        double BMI = greutate / (inaltime * inaltime);
        getBMI (greutate, inaltime);
        getDiagnostic (BMI);
        System.out.println(getDiagnostic(BMI));
    }

    public static double getBMI(double greutate, double inaltime) {
        double BMI = greutate / (inaltime * inaltime);
        return BMI;
    }

    public static String getDiagnostic(double BMI) {
        String diagnostic = "";
        if (BMI < 18.5) {
            diagnostic = "esti sub greutatea normala";
        } else if (BMI > 29.9) {
            diagnostic = "esti obez";
        } else {
            diagnostic = "esti peste greutatea normala";
        }
        return diagnostic;

    }
}

