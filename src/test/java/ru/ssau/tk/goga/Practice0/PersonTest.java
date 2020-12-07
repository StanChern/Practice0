package ru.ssau.tk.goga.Practice0;

import org.testng.annotations.Test;
import ru.ssau.tk.goga.Practice0.DataType.Person;

import static org.testng.Assert.*;

public class PersonTest {

    Person Mary = new Person();
    Person Mark = new Person("Mark", "Cold", 124);

    @Test
    public void testGetAndSetFirstName() {
        Mark.setFirstName(null);
        assertNull(Mary.getFirstName());
        assertNull(Mark.getFirstName());

        Mary.setFirstName("Mary");
        Mark.setFirstName("Markus");
        assertEquals(Mary.getFirstName(), "Mary");
        assertEquals(Mark.getFirstName(), "Markus");
    }

    @Test
    public void testGetAndSetLastName() {
        Mark.setLastName(null);
        assertNull(Mary.getLastName());
        assertNull(Mark.getLastName());

        Mary.setLastName("Morning");
        Mark.setLastName("Colder");
        assertEquals(Mary.getLastName(), "Morning");
        assertEquals(Mark.getLastName(), "Colder");
    }

    @Test
    public void testGetAndSetPassportID() {
        assertEquals(Mary.getPassportID(), 0);
        assertEquals(Mark.getPassportID(), 124);

        Mary.setPassportID(325668);
        Mark.setPassportID(656516);
        assertEquals(Mary.getPassportID(), 325668);
        assertEquals(Mark.getPassportID(), 656516);
    }

    @Test
    public void testOfConstructors() {
        Person nullPerson = new Person();
        Person namePerson = new Person("Oleg", "Bububu");
        Person personID = new Person(358);
        Person fullPerson = new Person("Marina", "Koshkina", 21);

        assertNull(nullPerson.getFirstName());
        assertNull(nullPerson.getLastName());
        assertEquals(nullPerson.getPassportID(), 0);

        assertEquals(namePerson.getFirstName(), "Oleg");
        assertEquals(namePerson.getLastName(), "Bububu");
        assertEquals(namePerson.getPassportID(), 0);

        assertNull(personID.getFirstName());
        assertNull(personID.getLastName());
        assertEquals(personID.getPassportID(), 358);

        assertEquals(fullPerson.getFirstName(), "Marina");
        assertEquals(fullPerson.getLastName(), "Koshkina");
        assertEquals(fullPerson.getPassportID(), 21);
    }
}