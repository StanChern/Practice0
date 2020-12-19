package ru.ssau.tk.goga.Practice0.Strings;

public class MyString {

    static void splitLine(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.charAt(i));
        }
    }

    static void getStringBytes(String myString) {
        byte[] stringBytes = myString.getBytes();
        for (int bytes : stringBytes) {
            System.out.println(bytes);
        }
    }

   /* static void checkingStrings() {
        String s1 = "S";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }*/

    static boolean checkPalindrome(String myString) {
        String palindrome = new StringBuilder(myString).reverse().toString();
        return myString.equals(palindrome);
    }

    static boolean differentInRegister(String s1, String s2) {
        return s1.equalsIgnoreCase(s2) && !s1.equals(s2);
    }

   /* static void escapeCharacter() {
        int i = 0;
        //табуляция
        System.out.println("Символ\t№" + ++i);
        //удаление последнего элемента в строке
        System.out.println("Символ\b№" + ++i);
        //переход на новую строку
        System.out.println("Символ\n№" + ++i);
        //игнорирование текста до \r
        System.out.println("Символ\r№" + ++i);
        //символ '
        System.out.println("Символ\'№" + ++i);
        //символ "
        System.out.println("Символ\"№" + ++i);
        // символ /
        System.out.println("Символ\\№" + ++i);
    }*/

    static int findFirstInSecond(String str1, String str2) {
        return str2.indexOf(str1);
    }

    static int findFirstInSecondToo(String str1, String str2) {
        return str2.indexOf(str1, str2.length() / 2);
    }

    static int findFirstInSecondTooToo(String str1, String str2) {
        return str2.lastIndexOf(str1, str2.length() / 2);
    }

    static int countPrefixPostfix(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.startsWith(prefix) & string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    static int countPrefixPostfixToo(String[] strings, String prefix, String postfix) {
        int count = 0;
        for (String string : strings) {
            if (string.trim().startsWith(prefix) & string.trim().endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }
}