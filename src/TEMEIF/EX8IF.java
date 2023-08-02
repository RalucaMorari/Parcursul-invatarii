package TEMEIF;

import java.util.Scanner;

public class EX8IF {
    public static void main(String[] args) {



//        Citeste de la tastatura previziunea pentru vreme si viteza vantului.
//        Previziunea pentru vreme poate fi “rainy” sau “snowing”.
//        Daca previziunea pentru vreme este “rainy” sau previziunea este “snowing”
//        si viteaza vantului este mai mare decat 30,
//        afiseaza in consola mesajul “Ramai in casa, este periculos afara”
//        Altfel, afiseaza mesajul: “S-ar putea sa fie frumos afara”
//
//De exemplu, pentru valorile initiale:
//
//String currentForecast = "rainy"
//int currentWindSpeed = 40
//se va afisa in consola mesajul "Ramai in casa, este periculos afara"

        Scanner scanner = new Scanner(System.in);
        String currentForecast = scanner.nextLine();
        int currentWindSpeed = scanner.nextInt();

//        String currentForecast = "rainy";
//        int currentWindSpeed = 40;
        if (currentForecast.equals("rainy") && currentWindSpeed > 30) {
            System.out.println("Ramai in casa, este periculos afara");
        } else {
            System.out.println("S-ar putea sa fie frumos afara");
        }

    }


}

