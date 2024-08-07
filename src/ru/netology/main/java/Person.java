package ru.netology.main.java;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {

        return age >= 0;
    }

    public boolean hasAddress() {
        return address != null;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {

        return surname;
    }

    public OptionalInt getAge() {

        return OptionalInt.of(age);
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void happyBirthday() {

        age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAge(age).setAddress(address);
    }

    @Override
    public String toString() {

        return "Person: [" +
                "имя:'" + name + '\'' +
                ", фамилия:'" + surname + '\'' +
                ", возраст: " + age +
                ", адрес регистрации:'" + address + '\'' +
                ']';

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(address, person.address);
    }


    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }


}