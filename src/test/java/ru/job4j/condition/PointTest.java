package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void whenMinus37To8Minus4Then15Dot556() {
        double expected = 15.556;
        Point first = new Point(-3, 7);
        Point second = new Point(8, -4);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void when92ToMinus622Then25() {
        double expected = 25;
        Point first = new Point(9, 2);
        Point second = new Point(-6, 22);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus8Minus7To217Then26() {
        double expected = 26;
        Point first = new Point(-8, -7);
        Point second = new Point(2, 17);
        double output = first.distance(second);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}