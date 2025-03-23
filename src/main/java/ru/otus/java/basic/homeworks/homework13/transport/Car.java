package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class Car extends Transport {
    @Override
    public String getType() {
        return "Машина";
    }

    @Override
    public void move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.РАВНИНА) {
            System.out.println("Машина проехала " + distance + " км. по равнине");
        } else {
            System.out.println("Машина не может ехать по " + terrain);
        }
    }
}
