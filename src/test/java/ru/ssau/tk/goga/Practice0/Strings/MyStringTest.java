package ru.ssau.tk.goga.Practice0.Strings;

import org.testng.annotations.Test;

import java.nio.charset.StandardCharsets;

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

    @Test
    public void testDoPopppo() {
        assertEquals(MyString.doPopppo("opopopopo", "opo", "po"), "popppo");
    }

    @Test
    public void testGetSubstring() {
        assertEquals(MyString.getSubstring("string", 20, 100), "");
        assertEquals(MyString.getSubstring("string", 1, 2), "t");
        assertEquals(MyString.getSubstring("string", -1, 12345), "string");
    }

    @Test
    public void testSet() {
        String str = "когда уже новый год";
        String[] arrayStr = MyString.parseStringOnArray(str);
        assertEquals(arrayStr[0], "Когда");
        assertEquals(arrayStr[1], "Уже");
        assertEquals(arrayStr[2], "Новый");
        assertEquals(arrayStr[3], "Год");
    }

    @Test
    public void testConcatenateStrings() {
        String[] strings = {"Нескоро", "наверное", "он"};
        assertEquals(MyString.concatenateStrings(strings), "Нескоро, наверное, он");
    }

    @Test
    public void testSequenceOfNumbers() {
        assertEquals(MyString.sequenceOfNumbers(3),"0 1 2");
    }

    @Test
    public void testChangeCharsetStr() {
        String str = "hello world";
        MyString.changeCharsetStr(str, StandardCharsets.UTF_8, StandardCharsets.UTF_16LE);
        MyString.changeCharsetStr(str,StandardCharsets.UTF_16LE,StandardCharsets.UTF_8);
    }
}