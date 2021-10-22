package calculator;

import vector.Vector2;

import java.util.Scanner;

public class ConsoleCatcher {
    private String input;
    private double operator1;
    private double operator2;
    private String operation;

    public ConsoleCatcher() {
        operator1 = 0;
        operator2 = 0;
    }

    public void question() {
        System.out.println("Write some operation (+ - / *):");
    }

    public void getConsole() {
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        System.out.println(input);
    }

    public void getOperators() {
        // split("-")
        // "[-+*/]"
        // String operatorsString[] = new String[2];
        String operatorsString[] = input.split("[-+*/]");
        // String symbolsString[] = new String[2];
        String symbolsString[] = input.split("[0-9]+");

        System.out.println("Operadores en string");
        for (int i = 0; i < operatorsString.length; i++) {
            System.out.println(operatorsString[i]);
        }

        System.out.println("////////////////");

        System.out.println("Símbolos en string");
        for (int i = 0; i < symbolsString.length; i++) {
            System.out.println(symbolsString[i]);
        }

        System.out.println("//////////////");

        String symbols = "";
        for (int i = 0; i < symbolsString.length; i++) {
            symbols += symbolsString[i];
        }
        System.out.println("Symbols: " + symbols);

        operator1 = Double.parseDouble(operatorsString[0]);
        operator2 = Double.parseDouble(operatorsString[1]);


        // input.indexOf();

    }



}
