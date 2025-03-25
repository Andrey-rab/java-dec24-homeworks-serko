package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class Bicycle implements Transport {
    @Override
    public String getType() {
        return "Велосипед";
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.БОЛОТО) {
            System.out.println("Велосипед не может ехать по " + terrain);
            return false;
        }
        System.out.println("Велосипед проехал " + distance + " км по " + terrain + ".");
        return true;
    }
}
