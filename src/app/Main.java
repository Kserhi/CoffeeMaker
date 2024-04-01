package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BeverageMachine beverageMachine = new BeverageMachine();

        switch (choiceOption()) {
            case 1 -> beverageMachine.setBeverage(new Espresso());
            case 2 -> beverageMachine.setBeverage(new Cappuccino());
            case 3 -> beverageMachine.setBeverage(new Latte());
        }

        System.out.println(beverageMachine.make());


    }

    public static int choiceOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 Choose a drink:
                      1 - Espresso
                      2 - Cappuccino
                      3 - Latte
                """);
        return scanner.nextInt();
    }


}
