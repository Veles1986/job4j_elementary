package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void whenStart3Finish56Sum1593() {
        int start = 3;
        int finish = 56;
        int result = Counter.sum(start, finish);
        int expected = 1593;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart45Finish45Sum45() {
        int start = 45;
        int finish = 45;
        int result = Counter.sum(start, finish);
        int expected = 45;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart34Finish20Sum0() {
        int start = 34;
        int finish = 20;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus24Finish98Sum4551() {
        int start = -24;
        int finish = 98;
        int result = Counter.sum(start, finish);
        int expected = 4551;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusEightToTwentyThenNinety() {
        int start = -8;
        int finish = 20;
        int result = Counter.sumByEven(start, finish);
        int expected = 90;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromSevenToSevenThenZero() {
        int start = 7;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromSixToSixThenSix() {
        int start = 6;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToFortySevenThenSix() {
        int start = 3;
        int finish = 47;
        int result = Counter.sumByEven(start, finish);
        int expected = 550;
        assertThat(result).isEqualTo(expected);
    }
}