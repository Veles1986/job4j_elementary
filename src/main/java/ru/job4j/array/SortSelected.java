package ru.job4j.array;

public class SortSelected {
    public static int[] mySort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] > data[FindLoop.indexInRange(data, MinDiapason.findMin(data, i + 1, data.length - 1), i + 1, data.length - 1)]) {
                data = SwitchArray.swap(data, i, FindLoop.indexInRange(data, MinDiapason.findMin(data, i + 1, data.length - 1), i + 1, data.length - 1));
            }
        }
        return data;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            data = SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
