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
        assertEquals(MyArray.generateOddNumbers(2), new int[]{1,3});
        assertEquals(MyArray.generateOddNumbers(1), new int[]{1});
        assertEquals(MyArray.generateOddNumbers(5), new int[]{1,3,5,7,9});
    }

    @Test
    public void testGenerateEvenNumbers() {
        assertEquals(MyArray.generateFlippedEvenNumbers(2), new int[]{4, 2});
        assertEquals(MyArray.generateFlippedEvenNumbers(1), new int[]{2});
        assertEquals(MyArray.generateFlippedEvenNumbers(5), new int[]{10, 8, 6, 4, 2});
    }
}