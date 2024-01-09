package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {
    @Test
    void whenSwapBorderArrayLengthIs4() {
        int[] input = {1, 2, 3, 4};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs6() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs3() {
        int[] input = {1, 2, 3};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapBorderArrayLengthIs1() {
        int[] input = {1};
        int[] result = SwitchArray.swapBorder(input);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapArray12345678910Source3Destination7ThenArray12385674910() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 3;
        int destination = 7;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1, 2, 3, 8, 5, 6, 7, 4, 9, 10};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapArray1Source0Destination0ThenArray1() {
        int[] input = {1};
        int source = 0;
        int destination = 0;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSwapArray5674123452102Source4Destination2ThenArray5674523412102() {
        int[] input = {56, 74, 12, 34, 52, 102};
        int source = 4;
        int destination = 2;
        int[] result = SwitchArray.swap(input, source, destination);
        int[] expected = {56, 74, 52, 34, 12, 102};
        assertThat(result).containsExactly(expected);
    }
}