package ru.otus.java.basic.homeworks.homework11.animals;

public class Animal {
    String name;
    double speed;
    double swimSpeed;
    int indurance;
    boolean isTired;

    public Animal(String name,double speed, double swimSpeed, int indurance) {
        this.name = name;
        this.speed = speed;
        this.swimSpeed = swimSpeed;
        this.indurance = indurance;
    }

    public double run(int distance) {
        if(isTired){
            System.out.println(name + " устал. Не может бежать");
            return -1;
        }

        int requiredStamina = distance;

        if(requiredStamina <= indurance){
            double time;
            indurance = indurance - requiredStamina;
            System.out.println(name + " побежал. Дистанция: " + requiredStamina + " м. Осталось " + indurance + " ед. выносливости.");
            time = distance/speed;
            System.out.println();
            checkTired();
            return time;
        } else {
            System.out.println(name + ". Не хватает выносливости для бега");
            isTired = true;
            System.out.println();
            return -1;
        }
    }

    public double swim(int distance) {
        System.out.println(name + " не умеет плавать");
        System.out.println();
        return -1;
    }

    public void checkTired(){
        if(indurance <= 0){
            isTired = true;
            System.out.println(name + " устал. Не может двигаться");
        }
    }

    public void info() {
        System.out.println("Имя животного: " + name);
        System.out.println("Скорость животного: " + speed + " м/с");
        System.out.println("Скорость плавония животного: " + swimSpeed + " м/с");
        System.out.println("Выносливость животного: " + indurance + " ед.");
        System.out.println("Состояние: " + (isTired ? "устал" : "Усталости нет"));
        System.out.println();
    }
}
