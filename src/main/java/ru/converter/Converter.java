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
        float euro = Converter.rubleToEuro(200);
        float dollar = Converter.rubleToDollar(289);
        System.out.println("200 rubles are " + euro + " euro.");
        System.out.println("289 rubles are " + dollar + " dollar.");
    }

}