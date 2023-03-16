package org.example.opp.basic;

public class RationNumber {
    int numerator;
    int denominator;
    public RationNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public RationNumber add(RationNumber o){
        int denominator = greatestCommonDivisor(this.denominator, o.getDenominator());
        int numerator = (denominator / this.denominator) * this.numerator + (denominator / o.getDenominator()) * o.getNumerator();
        return new RationNumber(numerator, denominator);
    }

    public RationNumber multiply(RationNumber o){
        return new RationNumber(this.numerator * o.getNumerator(), this.denominator * o.getDenominator());
    }

    @Override
    public String toString() {
        return "RationNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
}
