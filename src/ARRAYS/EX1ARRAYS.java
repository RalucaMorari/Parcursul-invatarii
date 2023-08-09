package ARRAYS;

public class EX1ARRAYS {
    public static void main(String[] args) {
        //1. Scrie un program care sa caute un numar de telefon intr-o lista de numere.
        // Programul va printa “numarul a fost gasit” sau “numarul nu a fost gasit”

       int  numbers [] = new int[10];
       int telnumber = 071234567;

       for(int i = 0; i< numbers.length; i++){
           if(numbers[i] == telnumber ){
               System.out.println("Numarul a fost gasit.");
           } else {
               System.out.println("Numarul nu a fost gasit.");
           }
       }
    }
}
