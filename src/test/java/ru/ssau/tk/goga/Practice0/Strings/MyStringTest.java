package ru.ssau.tk.goga.Practice0.Strings;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStringTest {

    @Test
    public void testCheckPalindrome() {
        assertFalse(MyString.checkPalindrome("12345"));
        assertTrue(MyString.checkPalindrome("11111"));
        assertTrue(MyString.checkPalindrome("арозаупаланалапуазора"));
        assertFalse(MyString.checkPalindrome("каток"));
        assertTrue(MyString.checkPalindrome("12345K54321"));
    }

    @Test
    public void testFindFirstInSecond() {
        assertEquals(MyString.findFirstInSecond("ca", "abcaca"), 2);
        assertEquals(MyString.findFirstInSecond("кот", "токикот"), 4);
        assertEquals(MyString.findFirstInSecond("qwer", "tr"), -1);
    }

    @Test
    public void testFindFirstInSecondToo() {
        assertEquals(MyString.findFirstInSecondToo("ca", "abcaca"), 4);
        assertEquals(MyString.findFirstInSecondToo("кот", "токикот"), 4);
        assertEquals(MyString.findFirstInSecondToo("qwer", "tr"), -1);
    }

    @Test
    public void testFindFirstInSecondTooToo() {
        assertEquals(MyString.findFirstInSecondTooToo("ca", "abcaca"), 2);
        assertEquals(MyString.findFirstInSecondTooToo("ток", "токикот"), 0);
        assertEquals(MyString.findFirstInSecondTooToo("qwer", "tr"), -1);
    }


    @Test
    public void testCountPrefixPostfix() {
        String[] strings = {"sos", "12345", "s", "123"};
        assertEquals(MyString.countPrefixPostfix(strings, "1", "3"), 1);
        assertEquals(MyString.countPrefixPostfix(strings, "1", "5"), 1);
        assertEquals(MyString.countPrefixPostfix(strings, "s", "s"), 2);
        assertEquals(MyString.countPrefixPostfix(strings, "reb", "rgerv"), 0);
    }

    @Test
    public void testCountPrefixPostfixToo() {
        String[] strings = {"sos", "12345", "s", "123"};
        assertEquals(MyString.countPrefixPostfixToo(strings, "1", "3"), 1);
        assertEquals(MyString.countPrefixPostfixToo(strings, "1", "5"), 1);
        assertEquals(MyString.countPrefixPostfixToo(strings, "s", "s"), 2);
        assertEquals(MyString.countPrefixPostfixToo(strings, "reb", "rgerv"), 0);
    }
}