/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.hemanthly.qcalc;

public class App {

    public static void main(String[] args) {
        System.out.println("Starting QCalc...");
        StandardCalculator calc = new StandardCalculator();
        calc.add(679, 13);
        calc.add(1.5, 1.678);
        calc.printResult();
    }
}

