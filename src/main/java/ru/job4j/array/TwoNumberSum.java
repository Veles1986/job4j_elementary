package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = {};
        int i = 0;
        int j = array.length - 1;
        int sum;
        while (i < j) {
            sum = array[i] + array[j];
            if (sum == target) {
                int[] res = {i, j};
                return res;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
