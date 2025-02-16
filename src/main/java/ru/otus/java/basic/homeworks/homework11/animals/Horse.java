package ru.otus.java.basic.homeworks.homework11.animals;

public class Horse extends Animal{
    public Horse(String name,double speed, double swimSpeed, int indurance) {
        super(name, speed, swimSpeed, indurance);
    }
    @Override
    public double swim(int distance) {
        if(isTired){
            System.out.println(name + " устал. Не может плыть");
            return -1;
        }
        int requiredStamina = distance;
        if(requiredStamina <= indurance){
            double time;
            indurance = indurance - requiredStamina * 4;
            System.out.println(name + " поплыл. Дистанция: " + requiredStamina + " м. Осталось " + indurance + " ед. выносливости.");
            time = distance/swimSpeed;
            System.out.println();
            checkTired();
            return time;
        } else {
            System.out.println(name + " устал. Не хватает выносливости для плавания");
            isTired = true;
            System.out.println();
            return -1;
        }
    }
}
