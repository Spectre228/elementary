package ru.condition;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {

    @Test
    @DisplayName("isEven method")
    void when2thenTrue() {
        int num = 2;
        boolean expected = true;
        boolean rsl = LogicNot.isEven(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("isEven method")
    void when1thenFalse() {
        int num = 1;
        boolean expected = false;
        boolean rsl = LogicNot.isEven(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("isPositive method")
    void when1thenTrue() {
        int num = 1;
        boolean expected = true;
        boolean rsl = LogicNot.isPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("isPositive method")
    void whenMinus7thenFalse() {
        int num = -7;
        boolean expected = false;
        boolean rsl = LogicNot.isPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("notEven method")
    void when3thenTrue() {
        int num = 1;
        boolean expected = true;
        boolean rsl = LogicNot.notEven(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("notEven method")
    void when8thenFalse() {
        int num = 8;
        boolean expected = false;
        boolean rsl = LogicNot.notEven(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("notPositive method")
    void whenMinus2thenTrue() {
        int num = -2;
        boolean expected = true;
        boolean rsl = LogicNot.notPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("notPositive method")
    void when6thenFalse() {
        int num = 6;
        boolean expected = false;
        boolean rsl = LogicNot.notPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("notEvenAndPositive method")
    void when5thenTrue() {
        int num = 5;
        boolean expected = true;
        boolean rsl = LogicNot.notEvenAndPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("notEvenAndPositive method")
    void when10thenFalse() {
        int num = 10;
        boolean expected = false;
        boolean rsl = LogicNot.notEvenAndPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("evenOrNotPositive method")
    void whenMinus4thenTrue() {
        int num = -4;
        boolean expected = true;
        boolean rsl = LogicNot.evenOrNotPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    @DisplayName("evenOrNotPositive method")
    void when12thenTrue() {
        int num = 12;
        boolean expected = true;
        boolean rsl = LogicNot.evenOrNotPositive(num);

        assertThat(rsl).isEqualTo(expected);
    }
}