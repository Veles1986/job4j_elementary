package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SquareTest {
    @Test
    void whenBound3Then149() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {1, 4, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenBound5Then1491625() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[] {1, 4, 9, 16, 25};
        assertThat(result).containsExactly(expected);
    }
}