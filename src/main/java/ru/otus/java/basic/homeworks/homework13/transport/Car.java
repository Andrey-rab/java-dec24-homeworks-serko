package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class Car implements Transport {
    private int fuel;

    public Car(int fuel){
        this.fuel = fuel;
    }
    @Override
    public String getType() {
        return "Машина";
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.БОЛОТО || terrain == TerrainType.ГУСТОЙ_ЛЕС) {
            System.out.println("Машина не может ехать по " + terrain);
            return false;
        }
        if (fuel < distance) {
            System.out.println("Недостаточно бензина. Осталось: " + fuel);
            return false;
        }
        fuel -= distance;
        System.out.println("Машина проехала " + distance + " км по " + terrain + ". Осталось бензина: " + fuel);
        return true;
    }
}
