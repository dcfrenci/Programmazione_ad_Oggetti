package org.example.exception;

public class DivisionSquared {
    public static int divisionSquared(int a, int b) {
        try {
            return (a / b) * (a / b);
        } catch (ArithmeticException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(divisionSquared(10, 0));;
    }
}
