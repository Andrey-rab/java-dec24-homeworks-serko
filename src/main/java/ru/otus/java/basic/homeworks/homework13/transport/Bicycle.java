package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class Bicycle extends Transport {
    @Override
    public String getType() {
        return "Велосипед";
    }
    @Override
    public void move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.РАВНИНА){
            System.out.println("Велосипед проехал " + distance + " км. по " + terrain);
        } else {
            System.out.println("Велосипед не может ехать по " + terrain);
        }
    }
}
