package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MaxTest {

    @Test
    void whenMax5to2Then5() {
        int first = 5;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7to14Then14() {
        int first = 7;
        int second = 14;
        int result = Max.max(first, second);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8to8Then8() {
        int first = 8;
        int second = 8;
        int result = Max.max(first, second);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7to4to12Then12() {
        int first = 7;
        int second = 4;
        int third = 12;
        int result = Max.max(first, second, third);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax8to34to10Then34() {
        int first = 8;
        int second = 34;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 34;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax17to40toMinus13to75Then75() {
        int first = 17;
        int second = 40;
        int third = -13;
        int fourth = 75;
        int result = Max.max(first, second, third, fourth);
        int expected = 75;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3to7to2to6Then7() {
        int first = 3;
        int second = 7;
        int third = 2;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
 }