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
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(11, actualResult);
    }

    @Test
    @DisplayName("Test Subtraction of Two Integers")
    void testSubtractionOperation(){
        standardCalculator.subtract(13, 4);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(9, actualResult);
    }

    @Test
    @DisplayName("Test Multiplication of Two Integers")
    void testMultiplicationOperation(){
        standardCalculator.multiply(13, 4);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(52, actualResult);
    }

    @Test
    @DisplayName("Test Division of Two Integers")
    void testDivisionOperation(){
        standardCalculator.divide(12, 4);
        int actualResult = standardCalculator.getResult();
        Assertions.assertEquals(3.0, actualResult);
    }
}
