package ru.ssau.tk.goga.Practice0.Strings;

public class MainClass {
    public static void main(String[] args) {

        String s1 = "Home";
        String s2 = "home";
        String s3 = "хома";
        System.out.println(MyString.differentInRegister(s1, s2));
        System.out.println(MyString.differentInRegister(s3, s2));

    }
}