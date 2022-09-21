package Kata1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 4, 26);
        
        Person person = new Person("Heliot", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }
}
