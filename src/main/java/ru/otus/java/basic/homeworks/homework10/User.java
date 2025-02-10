package ru.otus.java.basic.homeworks.homework10;

public class User {
    /**
     * Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email
     *
     * Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта
     *
     * В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
     * ФИО: фамилия имя отчество
     * Год рождения: год рождения
     * e-mail: email
     *
     * В методе main() Main класса создайте массив из 10 пользователей и заполните его объектами и с помощью
     * цикла выведите информацию только о пользователях старше 40 лет.
     */
    private String name;
    private String surname;
    private String patronymic;
    private int birthYear;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public User(String name, String surname, String patronymic, int birthYear, String email) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.email = email;
    }
    public void printUserInfo() {
        System.out.println("ФИО: " + surname + " " + name + " " + patronymic);
        System.out.println("Год рождения: " + birthYear);
        System.out.println("e-mail: " + email);
    }
}
