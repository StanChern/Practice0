package ru.ssau.tk.goga.Practice0.DataType;

public class MainClass {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        /*Тут в методе checkAnotherPerson() создали нового человека, присвоили ему имя и вывели;
        Аркадия не трогали совсем */
        System.out.println(person.getFirstName());
        // Вывели Аркадия
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}
