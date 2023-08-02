package TEME1;

import java.util.Scanner;

public class EX9T1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu vechimea in companie");
        int yearsWorked = scanner.nextInt();
        System.out.println("introdu scorul de performanta");
        double performanceScore = scanner.nextDouble();
        System.out.println("introdu daca are recomandare");
        boolean hasManagerRecommendation = scanner.nextBoolean();
        System.out.println("introdu daca are sanctiuni disciplinare");
        boolean hasDisciplinaryAction = scanner.nextBoolean();
        System.out.println("introdu daca compania are promovarile inghetate");
        boolean isPromotionFreeze= scanner.nextBoolean();

        boolean isEligibleForPromotion1 = (yearsWorked>5 && performanceScore>8)||(hasManagerRecommendation && !hasDisciplinaryAction);
        System.out.println(isEligibleForPromotion1);

        boolean isEligibleForPromotionfinal = isEligibleForPromotion1 && !isPromotionFreeze;
        System.out.println(isEligibleForPromotionfinal);




    }
}
