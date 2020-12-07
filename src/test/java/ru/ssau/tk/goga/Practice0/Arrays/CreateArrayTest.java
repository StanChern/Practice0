package ru.ssau.tk.goga.Practice0.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateArrayTest {

    @Test
    public void testCreateArray() {
        assertEquals(CreateArray.createArray(2), new int[2]);
        assertEquals(CreateArray.createArray(10), new int[10]);
        assertEquals(CreateArray.createArray(1), new int[1]);
    }
}