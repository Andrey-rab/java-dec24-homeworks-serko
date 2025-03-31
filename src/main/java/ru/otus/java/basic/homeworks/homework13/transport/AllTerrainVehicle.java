package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class AllTerrainVehicle implements Transport {
    private int fuel;

    public AllTerrainVehicle(int fuel) {
        this.fuel = fuel;
    }
    @Override
    public String getType() {
        return "Вездеход";
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (fuel < distance) {
            System.out.println("Недостаточно бензина для вездехода. Осталось: " + fuel + ", требуется: " + distance);
            return false;
        }
        fuel -= distance;
        System.out.println("Вездеход проехал " + distance + " км по " + terrain + ". Осталось бензина: " + fuel);
        return true;
    }
}
