package ru.ssau.tk.goga.Practice0.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {

    @Test
    public void testCreateArray() {
        assertEquals(MyArray.createArray(2), new int[2]);
        assertEquals(MyArray.createArray(10), new int[10]);
        assertEquals(MyArray.createArray(1), new int[1]);
    }

    @Test
    public void testGenerateOnesArray() {
        assertEquals(MyArray.generateOnesArray(2), new int[]{2, 2});
        assertEquals(MyArray.generateOnesArray(1), new int[]{2});
        assertEquals(MyArray.generateOnesArray(5), new int[]{2, 1, 1, 1, 2});
    }

    @Test
    public void testGenerateOddNumbers() {
        assertEquals(MyArray.generateOddNumbers(2), new int[]{1, 3});
        assertEquals(MyArray.generateOddNumbers(1), new int[]{1});
        assertEquals(MyArray.generateOddNumbers(5), new int[]{1, 3, 5, 7, 9});
    }

    @Test
    public void testGenerateEvenNumbers() {
        assertEquals(MyArray.generateFlippedEvenNumbers(2), new int[]{4, 2});
        assertEquals(MyArray.generateFlippedEvenNumbers(1), new int[]{2});
        assertEquals(MyArray.generateFlippedEvenNumbers(5), new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testGenerateFibonacci() {
        assertEquals(MyArray.generateFibonacci(2), new int[]{1, 1});
        assertEquals(MyArray.generateFibonacci(1), new int[]{1});
        assertEquals(MyArray.generateFibonacci(5), new int[]{1, 1, 2, 3, 5});
    }

    @Test
    public void testGenerateSqrIndex() {
        assertEquals(MyArray.generatePowIndex(2), new int[]{0, 1});
        assertEquals(MyArray.generatePowIndex(1), new int[]{0});
        assertEquals(MyArray.generatePowIndex(5), new int[]{0, 1, 4, 9, 16});
    }

    @Test
    public void testSolveQuadraticEquation() {
        assertEquals(MyArray.solveQuadraticEquation(0, 2, -4), new double[]{2});
        assertEquals(MyArray.solveQuadraticEquation(10, 200, 1654), new double[]{});
        assertEquals(MyArray.solveQuadraticEquation(1, -2, 1), new double[]{1});
        assertEquals(MyArray.solveQuadraticEquation(1, 0, -9), new double[]{3, -3});
    }

    @Test
    public void testGetWithoutMultiplesOfThree() {
        assertEquals(MyArray.getWithoutMultiplesOfThree(1), new int[]{1});
        assertEquals(MyArray.getWithoutMultiplesOfThree(6), new int[]{1, 2, 4, 5, 7, 8});
    }

    @Test
    public void testGetArithmeticProgression() {
        assertEquals(MyArray.getArithmeticProgression(4, 5, 0), new double[]{5, 5, 5, 5});
        assertEquals(MyArray.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(MyArray.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }

    @Test
    public void testGetGeometricProgression() {
        assertEquals(MyArray.getGeometricProgression(5, 2, 2), new double[]{2, 4, 8, 16, 32});
        assertEquals(MyArray.getGeometricProgression(2, 1, 5), new double[]{1, 5});
        assertEquals(MyArray.getGeometricProgression(3, 400, 0.5), new double[]{400, 200, 100});
    }

    @Test
    public void testGetDividersOfNumbers() {
        double[] firstArray = MyArray.getDividersOfNumbers(6);
        assertEquals(MyArray.getDividersOfNumbers(6), new double[]{1, 2, 3, 6});
        assertEquals(MyArray.getDividersOfNumbers(7), new double[]{1, 7});
    }

    @Test
    public void testGetMirror() {
        assertEquals(MyArray.getMirror(6), new int[]{1, 2, 3, 3, 2, 1});
        assertEquals(MyArray.getMirror(7), new int[]{1, 2, 3, 4, 3, 2, 1});
    }

    @Test
    public void testChangeSign() {
        int[] array = {0, 564, -1159};
        MyArray.changeSign(array);
        assertEquals(array, new int[]{0, -564, 1159});
    }

    @Test
    public void testFindNumberInArray() {
        int[] array = {2, 6, 8, 10, 4};
        assertEquals(MyArray.findNumberInArray(array, 0), false);
        assertEquals(MyArray.findNumberInArray(array, 4), true);
        assertEquals(MyArray.findNumberInArray(array, 7), false);
    }

    @Test
    public void testFindNullInArray() {
        Integer[] array = new Integer[]{2, 5, 6, null};
        Integer[] array2 = new Integer[]{2, 5, 6};
        assertEquals(MyArray.findNullInArray(array), true);
        assertEquals(MyArray.findNullInArray(array2), false);
    }

    @Test
    public void testGetCountEvenNumbers() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {9, -6, 3, 2};
        int[] array3 = {7, -1, 3, 9};
        assertEquals(MyArray.getCountEvenNumbers(array1), 4);
        assertEquals(MyArray.getCountEvenNumbers(array2), 2);
        assertEquals(MyArray.getCountEvenNumbers(array3), 0);
    }

    @Test
    public void testGetMax() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {5};
        assertEquals(MyArray.getMax(array1),(Integer) 8);
        assertEquals(MyArray.getMax(array2),(Integer) 5);
        assertEquals(MyArray.getMax(new int[]{}), null);
    }
}