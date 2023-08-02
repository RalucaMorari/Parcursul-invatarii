package TEMEMETODS;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        String answer = getName();
        sayHello(answer);
    }
    public static void sayHello(String to){
        System.out.println("hello " + to);
    }

    public static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("what's your name");
        String answer = scanner.nextLine();
        return answer;
    }
}
