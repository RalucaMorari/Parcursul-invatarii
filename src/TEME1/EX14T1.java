package TEME1;

import java.util.Scanner;

public class EX14T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introdu credit scorul");
        int creditScore = scanner.nextInt();
        System.out.println("introdu daca are o sursa stabila de venit");
        boolean hasSteadyIncome = scanner.nextBoolean();
        System.out.println("introdu creditul");
        double loanAmount = scanner.nextDouble();
        System.out.println("introdu girantul");
        boolean hasCollateral = scanner.nextBoolean();
        System.out.println("isBanKCreditFreeze");
        boolean isBankInCreditFreeze = scanner.nextBoolean();
        boolean isLoanApproved = ((loanAmount>100000 && hasCollateral)||loanAmount<100000) && (creditScore>700 && hasSteadyIncome) && !isBankInCreditFreeze;
        System.out.println(isLoanApproved);

    }

}
