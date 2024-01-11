package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.length() == 1) {
                result = result + input.charAt(0);
            } else if ((i != input.length() - 1) && (input.charAt(i) == input.charAt(i + 1))) {
                counter++;
            } else if ((counter != 1)) {
                result = result + input.charAt(i) + counter;
                counter = 1;
            } else {
                result = result + input.charAt(i);
            }
        }
        return result;
    }
}
