public class SaltyEx1 {
    public static void main(String[] args) {
    /*Ai 2 valori de tip int, a=10 si b=20. Sa se interschimbe cele 2 valori, sa se afiseze rezultatul, dupa care sa
      se interschimbe variabilele din nou si sa se afiseze, astfel incat variabilele sa se intoarca la valorile initiale*/
        int a = 10;
        int b = 20;
        int c=a;

        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);


    }
}
