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
        assertEquals(MyString.findFirstInSecond("ca","abcaca"),2);
        assertEquals(MyString.findFirstInSecond("кот","токикот"),4);
        assertEquals(MyString.findFirstInSecond("qwer","tr"),-1);
    }
}