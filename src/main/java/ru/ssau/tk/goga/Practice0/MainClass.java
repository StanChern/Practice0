package ru.ssau.tk.goga.Practice0;

public class MainClass {

    public static void main(String[] args) {
        Person Mary = new Person();
        Mary.setFirstName("Mary");
        Mary.setLastName("Mort");
        Mary.setPassportID(2340523);
        System.out.println(Mary.getFirstName()+' '+Mary.getLastName());
        Person Mark = new Person();
        Mark.setFirstName("Mark");
        Mark.setLastName("Morten");
        Mark.setPassportID(3409726);
        Person Marty = new Person();
        Marty.setFirstName("Marty");
        Marty.setLastName("Loan");
        Marty.setPassportID(5360795);
    }
}
