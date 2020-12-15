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

    static int[] generateFibonacci(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        if (n == 2) {
            return new int[]{1, 1};
        }
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    static int[] generatePowIndex(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        return array;
    }

    static double[] solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        }
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[]{};
        }
        if (D == 0) {
            return new double[]{-b / (2 * a)};
        }
        double[] array = new double[2];
        array[0] = (-b + Math.sqrt(D)) / 2;
        array[1] = (-b - Math.sqrt(D)) / 2;
        return array;
    }

    static int[] getWithoutMultiplesOfThree(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return array;
    }

    static double[] getArithmeticProgression(int n, double a1, double d) {
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }

    static double[] getGeometricProgression(int n, double b1, double q) {
        double[] array = new double[n];
        array[0] = b1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] * q;
        }
        return array;
    }

    static double[] getDividersOfNumbers(int n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        double[] array = new double[count * 2 + (Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 0)];
        int j = 0;
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            if (n % (i + 1) == 0) {
                array[j] = (i + 1);
                array[array.length - j - 1] = n / (i + 1);
                j++;
            }
        }
        return array;
    }

    public static int[] getMirror(int n) {
        if (n == 0) {
            return null;
        }
        int[] array = new int[n];
        for (int i = 0; i < Math.ceil((double) n / 2); i++) {
            array[i] = i + 1;
            array[n - i - 1] = i + 1;
        }
        return array;
    }

    static void changeSign(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
    }

    static boolean findNumberInArray(int[] array, int n) {
        for (int i : array) {
            if (i == n) {
                return true;
            }
        }
        return false;
    }

    static boolean findNullInArray(Integer[] array) {
        for (Integer integer : array) {
            if (integer == null) {
                return true;
            }
        }
        return false;
    }

    static int getCountEvenNumbers(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static Integer getMax(int[] array) {
        if (array.length == 0) {
            return null;
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}