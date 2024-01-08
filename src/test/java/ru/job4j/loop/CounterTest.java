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
}