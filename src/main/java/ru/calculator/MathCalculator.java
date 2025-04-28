package ru.calculator;

import static ru.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndDivision(double first, double second) {
        return diff(first, second) + devide(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumAndMultiply(first, second) + diffAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма и произведение: " + sumAndMultiply(10, 20));
        System.out.println("Разность и произведение: " + diffAndDivision(11, 16));
        System.out.println("Сумма всех четырех: " + sumAll(7, 18));
    }

}
