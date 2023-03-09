package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    String lastname;

    LocalDate birthdate;

    public Person(String lastname, LocalDate birthdate) {
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastname, person.lastname) && Objects.equals(birthdate, person.birthdate);
    }

    @Override
    public int hashCode() {
        return birthdate.getYear() + 100 + birthdate.getMonthValue();
    }

    @Override
    public String toString() {
        return "Person{" + "lastname='" + lastname + '\'' + ", birthdate=" + birthdate + '}';
    }
}
