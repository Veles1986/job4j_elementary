package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Length of array ages: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Length of array surnames: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Length of array prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Michael";
        names[1] = "Alex";
        names[2] = "Charlie";
        names[3] = "Anna";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
