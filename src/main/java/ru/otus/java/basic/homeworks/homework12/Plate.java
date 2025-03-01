package ru.otus.java.basic.homeworks.homework12;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood){
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void info(){
        System.out.println("Тарелка: " + currentFood + "/" + maxFood + " еды");
    }

    public void addFood(int amount){
        if(amount <= 0){
            System.out.println("Нельзя добавить отрицательное или нулевое количество еды!");
            return;
        }
        if (amount + currentFood > maxFood){
            System.out.println("Добавлено: " + (maxFood - currentFood) + " еды. Максимум достигнут.");
            currentFood = maxFood;
        } else{
            currentFood = amount + currentFood;
            System.out.println("Добавлено: " + amount + " еды. Текущее кол-во: " + currentFood);
        }
    }

    public boolean decreaseFood(int amount){
        if (amount <= currentFood){
            currentFood = currentFood - amount;
            return true;
        } else {
            return false;
        }
    }
}
