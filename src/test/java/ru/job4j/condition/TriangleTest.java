package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TriangleTest {

    @Test
    void whenAb5Ac9Bc8Exist() {
        double ab = 5;
        double ac = 9;
        double bc = 8;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenAb12Ac5Bc6NotExist() {
        double ab = 12;
        double ac = 5;
        double bc = 6;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}