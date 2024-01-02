package com.hemanthly.qcalc;

public class StandardCalculator {
    private double result = 10;

    StandardCalculator(){
        System.out.println("Standard Calculator 1.0");
    }
    public void add(int num1, int num2){
        result =  num1 + (double)num2;
    }
    public void add(double num1, double num2){
        result =  num1 + num2;
    }
    public void subtract(int num1, int num2){
        result = num1 - (double)num2;
    }
    public void subtract(double num1, double num2){
        result = num1 - num2;
    }
    public void multiply(int num1, int num2){
        result = num1 * (double)num2;
    }
    public void multiply(double num1, double num2){
        result = num1 * num2;
    }
    public void divide(int num1, int num2){
        result = num1 / (double)num2;
    }
    public void divide(double num1, double num2){
        result = num1 / num2;
    }
    public double getResult(){
        return result;
    }
    public void setResult(int value){
        this.result = value;
    }
    public void clearResult(){
        this.result = 0;
    }
    public void printResult(){
        System.out.println("Standard Calculator Result: " + result);
    }

}
