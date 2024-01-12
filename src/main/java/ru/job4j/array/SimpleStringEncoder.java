package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        result = result + input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(i - 1)) {
                result = result + (counter != 1 ? counter : "") + input.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        result = result + (counter != 1 ? counter : "");
        return result;
    }
}
