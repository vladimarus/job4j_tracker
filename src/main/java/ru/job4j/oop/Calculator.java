package ru.job4j.oop;

public class Calculator {

    private static final int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int var) {
        return var - x;
    }

    public double divide(int var) {
        return (double) var / x;
    }

    public double sumAllOperation(int var) {
        return sum(var)
                + multiply(var)
                + minus(var)
                + divide(var);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        System.out.println(
                Calculator.minus(5));

        System.out.println(
                new Calculator().divide(4));

        System.out.println(
                new Calculator().sumAllOperation(3));
    }
}
