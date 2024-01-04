package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        int input = 420;
        int expectedEuro = 6;
        float outputEuro = Converter.rubleToEuro(input);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("420 rubles are " + outputEuro + " euro. Expected: " + expectedEuro + " euro. Test result: " + passedEuro);
        int expectedDollar = 7;
        float outputDollar = Converter.rubleToDollar(input);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("420 rubles are " + outputDollar + " dollar. Expected: " + expectedDollar + " dollar. Test result: " + passedDollar);
    }
}
