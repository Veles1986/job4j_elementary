package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSortForBigArray() {
        int[] data = new int[] {95, 41, 54, 25, 14, 93, 74, 52, 42, 42, 56, 54, 84, 19, 9, -5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 9, 14, 19, 25, 41, 42, 42, 52, 54, 54, 56, 74, 84, 93, 95};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortForSmallArray() {
        int[] data = new int[] {9, 5, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {5, 6, 9};
        assertThat(result).containsExactly(expected);
    }
}