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
     */
    public String name;
    public String surname;
    public String patronymic;
    public int birthYear;
    public String email;

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
