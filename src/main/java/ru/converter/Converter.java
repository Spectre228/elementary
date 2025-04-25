package ru.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = Math.round((value / 100) * 100.0f) / 100.0f;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = Math.round((value / 90) * 100.0f) / 100.0f;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 200;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        System.out.println("200 rubles are 2 euro. Test result : " + (out == expected));

        in = 289;
        expected = 3.21f;
        out = Converter.rubleToDollar(in);
        System.out.println("289 rubles are 3,21 euro. Test result : " + (out == expected));
    }

}