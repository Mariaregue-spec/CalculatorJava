package org.example;

import org.example.Calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("ADD TEST CASES");

        double[][] addCases = {
                {2.0, 3.0},
                {-5.0, 2.0},
                {2.5, 3.5}
        };

        for (double[] c : addCases) {

            double result = calculator.add(c[0], c[1]);

            System.out.println(c[0] + " + " + c[1] + " = " + result);
        }


        System.out.println("\nSUBTRACT TEST CASES");

        double[][] subtractCases = {
                {5.5, 2.0},
                {2.0, 5.5},
                {-3.0, -2.0}
        };

        for (double[] c : subtractCases) {

            double result = calculator.subtract(c[0], c[1]);

            System.out.println(c[0] + " - " + c[1] + " = " + result);
        }


        System.out.println("\nMULTIPLY TEST CASES");

        double[][] multiplyCases = {
                {2.5, 2.0},
                {-2.0, 3.0},
                {5.5, 0.0}
        };

        for (double[] c : multiplyCases) {

            double result = calculator.multiply(c[0], c[1]);

            System.out.println(c[0] + " * " + c[1] + " = " + result);
        }


        System.out.println("\nDIVIDE TEST CASES");

        double[][] divideCases = {
                {7.0, 2.0},
                {-6.0, 2.0},
                {5.5, 0.5}
        };

        for (double[] c : divideCases) {

            double result = calculator.divide(c[0], c[1]);

            System.out.println(c[0] + " / " + c[1] + " = " + result);
        }


        System.out.println("\nDIVIDE BY ZERO TEST");

        try {

            calculator.divide(5.0, 0.0);

        } catch (IllegalArgumentException e) {

            System.out.println("5.0 / 0.0 -> Error: " + e.getMessage());

        }

    }
}