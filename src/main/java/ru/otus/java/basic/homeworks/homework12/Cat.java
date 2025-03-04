package ru.otus.java.basic.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    public void feed(Plate plate) {
        if (isFull) {
            System.out.println("Кот " + name + " сыт.");
            return;
        }
        if (plate.decreaseFood(appetite)) {
            isFull = true;
            System.out.println(name + " поел и сыт.");
        } else {
            System.out.println(name + " не поел. Не хватает еды в тарелке");
        }

    }

    public void info() {
        System.out.println("Имя животного: " + name);
        System.out.println("Аппетит животного: " + appetite);
        System.out.println("Сытость: " + (isFull ? "Сыт" : "Голоден"));
    }


}
