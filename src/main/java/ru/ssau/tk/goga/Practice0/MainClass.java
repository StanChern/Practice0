package ru.ssau.tk.goga.Practice0;

public class MainClass {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        /*1.вызываем checkInt(number), который делает нам нам sout(10).
        Значение поля number поменяется только внутри выполнения этого
        метода(т.е. начение копии number), а глобально для всей программы number останется = 5   */
        checkPerson(person);
        /*2. в этом случае поле firstName класса person изменится, т.к. создавалась не копия
        объекта, а копия ссылки на объект
         */
        System.out.println(number);
        // Выводим получаем 5
        System.out.println(person.getFirstName());
        // Выводим получаем Олега
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }
}
