package lesson_2_oop.person;

import java.time.LocalDate;

public class Person {
    //    1. Создайте класс Person для описания человека. Перечислите в нём поля Идентификатор (числовой),
    //    Имя, Фамилия, Дата рождения, налоговый номер (числовой), Пол

    //    2. В созданном классе Person сделайте поля приватными и добавьте методы доступа с соответствующими проверками.
    //    3. В классе Person создайте все виды конструкторов.

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private long taxNumber;
    private Gender gender;

    //конструктор по умолчанию
    private Person() {
    }

    public Person(long taxNumber) {
        if (taxNumber < 0) throw new RuntimeException("WRONG!");
        this.taxNumber = taxNumber;
    }

    public Person(long taxNumber, String lastName) {
        this(taxNumber);
        this.lastName = lastName;
    }

    //clone constructor
    public Person(Person original) {
        this(original.taxNumber, original.lastName);
        this.id = original.id;
        this.firstName = original.firstName;
        this.dateOfBirth = original.dateOfBirth;
        this.gender = original.gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("id can't be lower than 0");
        }
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("name can't be empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("name can't be empty");
        }
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTaxNumber(long taxNumber) {
        if (taxNumber < 0 || String.valueOf(taxNumber).length() < 6) {
            throw new IllegalArgumentException("taxNum must be not less 6 digits");
        }
        this.taxNumber = taxNumber;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getTaxNumber() {
        return taxNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }
}
