package com.hemanthly.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        standardCalculator.add(1, 10);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(11, actualResult);
    }

    @Test
    @DisplayName("Test Subtraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(13, 4);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(9, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(13, 4);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(52, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(12, 4);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(3, actualResult);
    }

    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        standardCalculator.add(1.5, 10.52);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(12.02, actualResult);
    }

    @Test
    @DisplayName("Test Subtraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        standardCalculator.subtract(13.34, 4.12);
        double actualResult = standardCalculator.getResult();
        // Allow a small delta for floating-point comparisons
        double delta = 0.001;
        Assertions.assertEquals(9.22, actualResult, delta);
    }

    @Test
    @DisplayName("Test Multiplication of Two Doubles")
    void testMultiplicationOperationForDoubles(){
        standardCalculator.multiply( 10.2, 2.50);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(25.5, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two doubles")
    void testDivisionOperationForDoubles(){
        standardCalculator.divide(10, 2.5);
        double actualResult = standardCalculator.getResult();
        Assertions.assertEquals(4.0, actualResult);
    }
}
