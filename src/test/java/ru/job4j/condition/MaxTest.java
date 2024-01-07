package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5to2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7to14Then14() {
        int left = 7;
        int right = 14;
        int result = Max.max(left, right);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8to8Then8() {
        int left = 8;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
 }