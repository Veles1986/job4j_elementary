package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void whenMinus37To8Minus4Then15Dot556() {
        double expected = 15.556;
        int x1 = -3;
        int y1 = 7;
        int x2 = 8;
        int y2 = -4;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when92ToMinus622Then25() {
        double expected = 25;
        int x1 = 9;
        int y1 = 2;
        int x2 = -6;
        int y2 = 22;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus8Minus7To217Then26() {
        double expected = 26;
        int x1 = -8;
        int y1 = -7;
        int x2 = 2;
        int y2 = 17;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}