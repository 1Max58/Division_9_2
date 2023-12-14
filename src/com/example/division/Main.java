package com.example.division;

public class Main {
    public static void main(String[] args) {
        int dividend = 8;
        int[] divisors = new int[] { 2, 0 };
        int arithmeticExceptionDivisorIndex = 1;
        int arrayIndexOutOfBoundsExceptionDivisorIndex = 2;
        int notThrowAnyExceptionDivisorIndex = 0;
        try {
            try {
                Division.divideByArrayIndex(dividend, divisors, arithmeticExceptionDivisorIndex);
            } catch (ArithmeticException e) {
                System.out.printf("Exception was thrown for index %d:%n", arithmeticExceptionDivisorIndex);
                System.out.println(e);
            }
            try {
                Division.divideByArrayIndex(dividend, divisors, arrayIndexOutOfBoundsExceptionDivisorIndex);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.printf("Exception was thrown for index %d:%n", arrayIndexOutOfBoundsExceptionDivisorIndex);
                System.out.println(e);
            }
            Division.divideByArrayIndex(dividend, divisors, notThrowAnyExceptionDivisorIndex);
            System.out.printf("No exception was thrown for index %d%n", notThrowAnyExceptionDivisorIndex);
        } finally {
            System.out.println("Finally block happened");
        }
    }
}
