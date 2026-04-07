package org.example;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult() {

        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {

        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {

        return secondNumber * firstNumber;
    }

    public double getDivisionResult() {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        }
        return 0;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {


        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {


        this.secondNumber = secondNumber;
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
