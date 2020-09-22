package ru.ssau.tk.goga.Practice0;

public class MainClass {

    public static void main(String[] args) {
        Person Mary = new Person();
        Mary.setFirstName("Mary");
        Mary.setLastName("Mort");
        Mary.setPassportID(2340523);
        System.out.println(Mary.getFirstName()+'\t'+Mary.getLastName()+'\t'+Mary.getPassportID());

        Person Mark = new Person("Mark", "Morten");
        Mark.setPassportID(3409726);
        System.out.println(Mark.getFirstName()+'\t'+Mark.getLastName()+'\t'+Mark.getPassportID());


        Person Marty = new Person(5360795);
        Marty.setFirstName("Marty");
        Marty.setLastName("Loan");
        System.out.println(Marty.getFirstName()+'\t'+Marty.getLastName()+'\t'+Marty.getPassportID());

        Person Mango = new Person("Mango", "Potato", 123);
        System.out.println(Mango.getFirstName()+'\t'+Mango.getLastName()+'\t'+Mango.getPassportID());
    }
}
