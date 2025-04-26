package ru.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2Euro() {
        float in = 200;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert198RblThen1Dot98Euro() {
        float in = 198;
        float expected = 1.98f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen2Dlr() {
        float in = 180;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert289RblThen3Dot21Dlr() {
        float in = 289;
        float expected = 3.21f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    /*
    Здесь ожидаемое значение имеет три знака после точки. Но при изначальной
    реализации методов rubleToEuro и rubleToDollar этот тест не прошел бы
    проверку, т. к. в самих методах было реализовано округление до двух знаков
    после точки, что превышает заданную точность. Для этой задачи я поменял
    округление в методах с двух до четырех знаков.
     */
    @Test
    void whenConvert1278Dot27RblThen14Dot203Dlr() {
        float in = 1278.27f;
        float expected = 14.203f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}