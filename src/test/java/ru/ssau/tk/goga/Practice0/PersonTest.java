package ru.ssau.tk.goga.Practice0;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testGetAndSetPerson() {
        Person Mary = new Person();
        Person Mark = new Person("Mark", "Cold", 124);

        Mary.setFirstName("Mary");
        Mary.setLastName("Morning");
        Mary.setPassportID(325668);
        Mark.setFirstName("Markus");
        Mark.setLastName("Colder");
        Mark.setPassportID(656516);

        assertEquals(Mary.getFirstName(), "Mary");
        assertEquals(Mary.getLastName(), "Morning");
        assertEquals(Mary.getPassportID(), 325668);
        assertEquals(Mark.getFirstName(), "Markus");
        assertEquals(Mark.getLastName(), "Colder");
        assertEquals(Mark.getPassportID(), 656516);
    }
}