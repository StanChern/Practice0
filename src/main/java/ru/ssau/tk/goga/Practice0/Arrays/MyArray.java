package ru.ssau.tk.goga.Practice0.Arrays;

public class MyArray {
    static int[] createArray(int n) {
        return new int[n];
    }

    static int[] generateOnesArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }
        array[0] = 2;
        array[n - 1] = 2;
        return array;
    }

    static int[] generateOddNumbers(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k + 2;
        }
        return array;
    }

    static int[] generateFlippedEvenNumbers(int n) {
        int[] array = new int[n];
        int k = n * 2;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k - 2;
        }
        return array;
    }
}
