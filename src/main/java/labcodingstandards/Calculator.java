// Copyright (C) 2025

package labcodingstandards;

import java.util.Scanner;

/**
 * Simple Calculator program that performs basic arithmetic operations.
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        char operator = reader.nextLine().charAt(0);

        double first;
        double second;
        String input;

        // Leer primer número
        while (true) {
            System.out.print("Enter first number: ");
            input = reader.nextLine();
            try {
                first = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid! Please enter a number.");
            }
        }

        // Leer segundo número
        while (true) {
            System.out.print("Enter second number: ");
            input = reader.nextLine();
            try {
                second = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid! Please enter a number.");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operation(first, second, operator);

        System.out.println(result);
        reader.close();
    }

    /**
     * Performs the operation based on the selected operator.
     *
     * @param first    the first number
     * @param second   the second number
     * @param operator  ('1' for +, '2' for -, '3' for *, '4' for /)
     * @return the result as a formatted string or an error message
     */
    private String operation(double first, double second, char operator) {
        double result;
        switch (operator) {
            case '1':
                result = first + second;
                break;
            case '2':
                result = first - second;
                break;
            case '3':
                result = first * second;
                break;
            case '4':
                if (second == 0) {
                    return "Error! Division by zero.";
                }
                result = first / second;
                break;
            default:
                return "Error! Operator is not correct.";
        }
        return "The result is: " + result;
    }
}

